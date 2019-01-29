package com.example.mybatisplus.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.example.mybatisplus.entity.AppUser;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Author: lxy
 * @Date: 2019/1/28 15:25
 */
public interface AppUserMapper extends BaseMapper<AppUser> {

    @Select("select * from auth_user")
    List<AppUser> selectUserList(IPage<AppUser> page);
}
