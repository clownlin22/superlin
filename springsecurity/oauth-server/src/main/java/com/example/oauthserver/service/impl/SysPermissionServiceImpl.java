package com.example.oauthserver.service.impl;


import com.example.oauthcommon.domain.SysPermission;
import com.example.oauthserver.mapper.SysPermissionMapper;
import com.example.oauthserver.service.SysPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SysPermissionServiceImpl implements SysPermissionService {
    @Autowired
    private SysPermissionMapper sysPermissionMapper;

    @Override
    public Set<SysPermission> findByRoleIds(Long id) {
        return sysPermissionMapper.findByRoleIds(id);
    }
}
