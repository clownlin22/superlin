package com.example.mybatisplus.service;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.example.mybatisplus.entity.AppUser;
import com.example.mybatisplus.mapper.AppUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @Author: lxy
 * @Date: 2019/1/15 14:48
 */
@Service
public class AppUserService {

    @Autowired
    private AppUserMapper appUserMapper;

    public void insert(AppUser appUser) {
        appUserMapper.insert(appUser);
    }

    public boolean updateById(AppUser appUser) {
        return appUserMapper.updateById(appUser)>0?true:false;
    }

    public boolean updateAllColumnById(AppUser appUser) {
        return appUserMapper.updateAllColumnById(appUser)>0?true:false;
    }

    public AppUser selectById(Long id) {
        return appUserMapper.selectById(id);
    }

    public  List<AppUser> selectByMap(HashMap<String, Object> map) {
        return appUserMapper.selectByMap(map);
    }

    public List<AppUser> selectBatchIds(List<String> resultList) {
        return appUserMapper.selectBatchIds(resultList);
    }

    public boolean deleteById(Long id) {
        return appUserMapper.deleteById(id)>0?true:false;
    }

    public boolean deleteByMap(HashMap<String, Object> map) {
        return appUserMapper.deleteByMap(map)>0?true:false;
    }

    public boolean deleteBatchIds(List<String> resultList) {
        return appUserMapper.deleteBatchIds(resultList)>0?true:false;
    }

    public List<AppUser> selectPage(AppUser appUser) {
        return appUserMapper.selectPage(
                new Page<AppUser>(1,3),
                //condition.create()效果一样
                new EntityWrapper<AppUser>()
                .between("id",1,1000)
                .eq("name",appUser.getName())
        );
    }

    public List<AppUser> selectList(AppUser appUser) {
        return appUserMapper.selectList(
          new EntityWrapper<AppUser>()
                .eq("name",appUser.getName())
                .like("password",appUser.getPassword())
                .or()
                .like("password","123")
                .orderBy("id")
                .last("desc limit 1,3")
        );
    }

    public boolean updateByEntity(AppUser appUser) {
        return appUserMapper.update(appUser,
                new EntityWrapper<AppUser>()
                .eq("name",appUser.getName())
        )>0?true:false;
    }

    public boolean deleteByEntity(AppUser appUser) {
        return appUserMapper.delete(
                new EntityWrapper<AppUser>()
                        .eq("name",appUser.getName())
        )>0?true:false;
    }
}
