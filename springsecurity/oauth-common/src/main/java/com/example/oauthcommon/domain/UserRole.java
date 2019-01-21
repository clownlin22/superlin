package com.example.oauthcommon.domain;

import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;


/**
 * @author lxy
 */
@TableName("auth_user_role")
public class UserRole implements Serializable {
    private static final long serialVersionUID = -2181708482280296043L;

    private Long id;
    private String user_id;
    private String role_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }
}
