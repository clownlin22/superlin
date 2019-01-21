package com.example.oauthserver.controller;


import com.example.oauthcommon.domain.AppUser;
import com.example.oauthcommon.domain.LoginAppUser;
import com.example.oauthcommon.domain.SysPermission;
import com.example.oauthcommon.domain.SysRole;
import com.example.oauthserver.service.AppUserService;
import com.example.oauthserver.service.SysPermissionService;
import com.example.oauthserver.service.SysRoleService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.CollectionUtils;

import java.util.Set;

/**
 * @author lxy
 */
@Controller
public class AppUserController {
    @Autowired
    private AppUserService appUserService;
    @Autowired
    private SysPermissionService sysPermissionService;
    @Autowired
    private SysRoleService sysRoleService;

    public LoginAppUser findByUsername(String username) {
        AppUser appUser = appUserService.findUserByUsername(username);
        if (appUser != null) {
            LoginAppUser loginAppUser = new LoginAppUser();
            BeanUtils.copyProperties(appUser, loginAppUser);
            Set<SysRole> sysRoles = sysRoleService.findRolesByUserId(appUser.getId());
            // 设置角色
            loginAppUser.setSysRoles(sysRoles);
            if (!CollectionUtils.isEmpty(sysRoles)) {
                for (SysRole sysRole : sysRoles) {
                    Set<SysPermission> syspermission = sysPermissionService.findByRoleIds(sysRole.getId());
                    loginAppUser.setPermissions(syspermission);
                }
            }
            return loginAppUser;
        }
        return null;
    }
}
