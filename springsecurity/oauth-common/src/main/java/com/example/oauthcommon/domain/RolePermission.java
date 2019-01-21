package com.example.oauthcommon.domain;


import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;


/**
 * @author lxy
 */
@TableName("auth_role_permission")
public class RolePermission implements Serializable {
    private static final long serialVersionUID = -2811074868912389416L;

    private Long id;
    private String role_id;
    private String permission_id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole_id() {
        return role_id;
    }

    public void setRole_id(String role_id) {
        this.role_id = role_id;
    }

    public String getPermission_id() {
        return permission_id;
    }

    public void setPermission_id(String permission_id) {
        this.permission_id = permission_id;
    }
}
