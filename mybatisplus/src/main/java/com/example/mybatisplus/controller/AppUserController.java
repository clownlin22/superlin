package com.example.mybatisplus.controller;

import com.example.mybatisplus.entity.AppUser;
import com.example.mybatisplus.service.AppUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * @Author: lxy
 * @Date: 2019/1/15 14:34
 */
@RestController
public class AppUserController {

    @Autowired
    private AppUserService appUserService;

    private void querybody(AppUser appUser, HashMap<String, Object> map) {
        if(appUser.getId()!=null){
            map.put("id",appUser.getId());
        }else if(appUser.getName()!=null){
            map.put("name",appUser.getName());
        }else if(appUser.getPassword()!=null){
            map.put("password",appUser.getPassword());
        }
    }

    /**
     * insert
     */
    @GetMapping(value = "/insert")
    public Long insert(AppUser appUser) {
        appUserService.insert(appUser);
        return appUser.getId();
    }

    /**
     * updateById
     */
    @GetMapping(value = "/updateById")
    public boolean updateById(AppUser appUser) {
        return appUserService.updateById(appUser);
    }

    /**
     * updateAllColumnById(更新所有的列)
     */
    @GetMapping(value = "/updateAllColumnById")
    public boolean  updateAllColumnById(AppUser appUser) {
        return appUserService.updateAllColumnById(appUser);
    }

    /**
     * selectById
     */
    @GetMapping(value = "/selectById")
    public AppUser  selectById(Long id) {
        return appUserService.selectById(id);
    }

    /**
     * selectByMap(返回多条)
     */
    @GetMapping(value = "/selectByMap")
    public List<AppUser> selectByMap(AppUser appUser) {
        HashMap<String, Object> map = new HashMap<>();
        querybody(appUser, map);
        return appUserService.selectByMap(map);
    }

    /**
     * selectBatchIds
     */
    @GetMapping(value = "/selectBatchIds")
    public List<AppUser>  selectBatchIds(Long ids) {
        String[] split = ids.toString().split(",");
        //数组转集合
        List<String> resultList = new ArrayList<>(split.length);
        Collections.addAll(resultList,split);
        return appUserService.selectBatchIds(resultList);
    }

    /**
     * deleteById
     */
    @GetMapping(value = "/deleteById")
    public boolean deleteById(Long id) {
        return appUserService.deleteById(id);
    }

    /**
     * deleteByMap
     */
    @GetMapping(value = "/deleteByMap")
    public boolean deleteByMap(AppUser appUser) {
        HashMap<String, Object> map = new HashMap<>();
        querybody(appUser, map);
        return appUserService.deleteByMap(map);
    }

    /**
     * deleteBatchIds
     */
    @GetMapping(value = "/deleteBatchIds")
    public boolean  deleteBatchIds(Long ids) {
        String[] split = ids.toString().split(",");
        //数组转集合
        List<String> resultList = new ArrayList<>(split.length);
        Collections.addAll(resultList,split);
        return appUserService.deleteBatchIds(resultList);
    }

    /**
     * ------------*********—————fuck  you  baby—————————————————
     *        ****      *****
     *              --
     *            +++++
     */

    /**
     * selectPage
     */
    @GetMapping(value = "/selectPage")
    public List<AppUser>  selectPage(AppUser appUser) {
        return appUserService.selectPage(appUser);
    }

    /**
     * selectList
     */
    @GetMapping(value = "/selectList")
    public List<AppUser>  selectList(AppUser appUser) {
        return appUserService.selectList(appUser);
    }

    /**
     * update
     */
    @GetMapping(value = "/updateByEntity")
    public boolean updateByEntity(AppUser appUser){
        return appUserService.updateByEntity(appUser);
    }

    /**
     * delete
     */
    @GetMapping(value = "/deleteByEntity")
    public boolean deleteByEntity(AppUser appUser){
        return appUserService.deleteByEntity(appUser);
    }


    /**
     * ------------*********—————love  you  baby—————————————————
     *        ****      *****
     *              --
     *            +++++
     */






}
