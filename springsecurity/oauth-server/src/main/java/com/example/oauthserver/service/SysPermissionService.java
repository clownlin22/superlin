package com.example.oauthserver.service;


import com.example.oauthcommon.domain.SysPermission;

import java.util.Set;

public interface SysPermissionService {


    Set<SysPermission> findByRoleIds(Long id);
}
