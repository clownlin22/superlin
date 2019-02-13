package com.example.oauthserver.service.impl;


import com.example.oauthcommon.domain.SysRole;
import com.example.oauthserver.mapper.SysRoleMapper;
import com.example.oauthserver.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class SysRoleServiceImpl implements SysRoleService {
    @Autowired
    private SysRoleMapper sysRoleMapper;
    @Override
    public Set<SysRole> findRolesByUserId(Long id) {
        return sysRoleMapper.findRolesByUserId(id);
    }
}
