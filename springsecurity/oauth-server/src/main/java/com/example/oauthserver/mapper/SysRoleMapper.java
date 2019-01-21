package com.example.oauthserver.mapper;


import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.example.oauthcommon.domain.SysRole;
import org.apache.ibatis.annotations.Select;

import java.util.Set;


public interface SysRoleMapper extends BaseMapper<SysRole> {

    @Select("select r.* from auth_user_role ru inner join auth_role r on r.id = ru.role_id where ru.user_id = #{userId}")
    Set<SysRole> findRolesByUserId(Long userId);
}
