package com.example.oauthserver.service;


import com.example.oauthcommon.domain.AppUser;

public interface AppUserService {
    AppUser findUserByUsername(String username);


}

