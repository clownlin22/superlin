package com.example.oauthserver.service.impl;


import com.example.oauthcommon.domain.AppUser;
import com.example.oauthserver.mapper.AppUserMapper;
import com.example.oauthserver.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppUserServiceImpl implements AppUserService {

    @Autowired
    private AppUserMapper appUserMapper;

    @Override
    public AppUser findUserByUsername(String username) {
        AppUser appUser = new AppUser();
        appUser.setName(username);
        return appUserMapper.selectOne(appUser);
    }


}
