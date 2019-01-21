package com.example.oauthclient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private TokenStore tokenStore;

    public boolean revokeTokenExRe(String tokenValue) {
        OAuth2AccessToken accessToken = this.tokenStore.readAccessToken(tokenValue);
        if (accessToken == null) {
            return false;
        } else {
            this.tokenStore.removeAccessToken(accessToken);
            return true;
        }
    }
}
