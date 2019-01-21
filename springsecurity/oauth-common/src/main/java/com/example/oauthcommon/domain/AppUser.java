package com.example.oauthcommon.domain;


import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;


/**
 * @author lxy
 */
@TableName("auth_user")
public class AppUser  implements Serializable {
    private static final long serialVersionUID = -6489147021901467200L;

    private Long id;
    private String name;
    private String password;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
