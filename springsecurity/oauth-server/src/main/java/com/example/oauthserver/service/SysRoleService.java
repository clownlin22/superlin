package com.example.oauthserver.service;

import com.example.oauthcommon.domain.SysRole;

import java.util.Set;

public interface SysRoleService {
    Set<SysRole> findRolesByUserId(Long id);
}
