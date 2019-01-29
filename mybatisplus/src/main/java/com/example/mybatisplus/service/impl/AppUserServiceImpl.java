package com.example.mybatisplus.service.impl;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.mybatisplus.entity.AppUser;
import com.example.mybatisplus.mapper.AppUserMapper;
import com.example.mybatisplus.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: lxy
 * @Date: 2019/1/28 15:35
 */
@Service
public class AppUserServiceImpl extends ServiceImpl<com.example.mybatisplus.mapper.AppUserMapper,AppUser> implements AppUserService {

    @Autowired
    private  AppUserMapper appUserMapper;

    @Override
    public List<AppUser> selectList(QueryWrapper<AppUser> appUserQueryWrapper) {
        return appUserMapper.selectList(appUserQueryWrapper);
    }

    @Override
    public IPage<AppUser> selectUserPage(Page<AppUser> page) {
        Page<AppUser> userPage = new Page<>();
        userPage.setRecords(appUserMapper.selectUserList(page));
        return userPage;
    }

}
