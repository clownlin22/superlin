package com.example.mybatisplus.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author lxy
 */
@Data
@TableName("auth_user")
public class AppUser{

    @TableId(type= IdType.AUTO)
    private Long id;
    private String name;
    private String password;

}
