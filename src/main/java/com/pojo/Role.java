package com.pojo;

import lombok.Data;
import lombok.experimental.Accessors;
import org.apache.ibatis.type.MappedJdbcTypes;

/**
 * 类功能说明: 角色管理
 * 类修改者	创建日期2019/9/13
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
@Data
@Accessors(chain = true)
public class Role {

    public Role(String name){
        this.name = name;
    }
    public Role(Long id,String roleName,String note ,String name){
        this.id = id;
        this.roleName = roleName;
        this.note = note;
        this.name = name;
    }
    public Role(Long id,String note ,String name){
        this.id = id;
        this.note = note;
        this.name = name;
    }
    private long id;
    private String roleName;
    private String note;
    private String name;




}
