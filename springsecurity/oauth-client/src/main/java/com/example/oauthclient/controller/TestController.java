package com.example.oauthclient.controller;

import com.example.oauthclient.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.OAuth2Request;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

/**
 * 测试接口
 * @author lxy
 */
@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @PreAuthorize("hasAuthority('back:permission:save3')")
    @GetMapping("/test3")
    public String test3() {
        return "win3";
    }

    @DeleteMapping(value = "/remove_tokenexfe", params = "access_token")
    public boolean removeToken(String access_token) {
        return testService.revokeTokenExRe(access_token);
    }

    @GetMapping(value = "/test4", params = "username")
    public String test4(String username) {
        OAuth2AccessToken accessToken = getAccessToken(username);
        return accessToken.toString();
    }

    @GetMapping(value = "/test5", params = "username")
    public boolean test5(String username) {
        OAuth2AccessToken accessToken = getAccessToken(username);
        return testService.revokeTokenExRe(accessToken.toString());
    }

    private final RedisConnectionFactory connectionFactory;
    public TestController(RedisConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }
    private OAuth2AccessToken getAccessToken(String username) {
        Map<String, String> s1 = new HashMap<>();
        s1.put("username", username);
        Set<String> s2 = new HashSet<>();
        s2.add("app");
        OAuth2Request oAuth2Request = new OAuth2Request(s1, "system", null,
                true, s2, null, null, null, null);

        Authentication userAuthentication = new Authentication() {
            @Override
            public Collection<? extends GrantedAuthority> getAuthorities() {
                return null;
            }

            @Override
            public Object getCredentials() {
                return null;
            }

            @Override
            public Object getDetails() {
                return null;
            }

            @Override
            public Object getPrincipal() {
                return username;
            }

            @Override
            public boolean isAuthenticated() {
                return false;
            }

            @Override
            public void setAuthenticated(boolean isAuthenticated) throws IllegalArgumentException {

            }

            @Override
            public String getName() {
                return null;
            }
        };

        OAuth2Authentication authentication = new OAuth2Authentication(oAuth2Request, userAuthentication);

        RedisTokenStore redisTokenStore = new RedisTokenStore(connectionFactory);
        OAuth2AccessToken accessToken = redisTokenStore.getAccessToken(authentication);

        return accessToken;
    }

}
