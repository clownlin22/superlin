package com.example.mybatisplus.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.example.mybatisplus.entity.AppUser;
import com.example.mybatisplus.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author: lxy
 * @Date: 2019/1/28 15:25
 */
@RestController
public class AppUserController {

    @Autowired
    private AppUserService appUserService;

    @GetMapping(value = "/selectList")
    public List<AppUser> selectUserList() {
        Page<AppUser> page = new Page<>(1, 10);
        page.setRecords(appUserService.selectList(new QueryWrapper<AppUser>()));
        IPage<AppUser> userPage= appUserService.selectUserPage(page);
        List<AppUser> records = userPage.getRecords();
        return records;
    }



}
