package com.example.oauthserver.mapper;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.oauthcommon.domain.SysPermission;
import org.apache.ibatis.annotations.Select;

import java.util.Set;

public interface SysPermissionMapper extends BaseMapper<SysPermission> {
    @Select("select p.* from auth_permission p  left JOIN auth_role_permission rp on rp.permission_id=p.id LEFT JOIN auth_role r on r.id=rp.role_id where role_id=#{id}")
    Set<SysPermission> findByRoleIds(Long id);
}
