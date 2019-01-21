package com.example.oauthserver.service;

import com.example.oauthcommon.domain.LoginAppUser;
import com.example.oauthserver.controller.AppUserController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationCredentialsNotFoundException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @Author: lxy
 * @Date: 2019/1/21 13:41
 */
@Service("userDetailsService")
public class UserDetailServiceImpl implements UserDetailsService {

    @Autowired
    private AppUserController appUserController;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        LoginAppUser loginAppUser = appUserController.findByUsername(username);
        if (loginAppUser == null) {
            throw new AuthenticationCredentialsNotFoundException("用户不存在");
        } else if (!loginAppUser.isEnabled()) {
            throw new DisabledException("用户已作废");
        }

        return loginAppUser;
    }
}
