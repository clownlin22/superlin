package com.example.mybatisplus.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.mybatisplus.entity.AppUser;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: lxy
 * @Date: 2019/1/28 15:25
 */
@Service
public interface AppUserService extends IService<AppUser> {

    List<AppUser> selectList(QueryWrapper<AppUser> appUserQueryWrapper);

    IPage<AppUser> selectUserPage(Page<AppUser> page);
}
