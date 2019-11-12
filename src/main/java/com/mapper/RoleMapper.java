package com.mapper;

import com.pojo.Role;
import org.apache.ibatis.annotations.Param;

/**
 * 类功能说明:
 * 类修改者	创建日期2019/9/13
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
public interface RoleMapper {

     Role getRole(Long id);
     Role findRole(String roleName);

     String findName(@Param("name") String name);
     int deleteRole(Long id);
    int insertRole(Role role);

    void update(@Param("name") String name);

}
