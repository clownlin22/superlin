package com.example.mybatisplus.entity;


import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;

/**
 * @author lxy
 */
@Data
@TableName("auth_user")
public class AppUser{

    private Long id;
    private String name;
    private String password;

}
