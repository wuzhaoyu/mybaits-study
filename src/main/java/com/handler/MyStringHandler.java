package com.handler;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.MappedJdbcTypes;
import org.apache.ibatis.type.MappedTypes;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 类功能说明:
 * 类修改者	创建日期2019/9/13
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
@MappedTypes({String.class})
@MappedJdbcTypes(JdbcType.VARCHAR)
@Slf4j
public class MyStringHandler implements TypeHandler<String> {

    @Override
    public String getResult(ResultSet rs, String colName) throws SQLException {
        log.info("使用我的TypeHandler,ResultSet列名获取字符串");
        System.out.println("使用我的TypeHandler,ResultSet列名获取字符串");
        return rs.getString(colName);
    }
    @Override
    public String getResult(ResultSet rs, int index) throws SQLException {
        log.info("使用我的TypeHandler,ResultSet下标获取字符串");
        System.out.println("使用我的TypeHandler,ResultSet列名获取字符串");

        return rs.getString(index);
    }
    @Override
    public String getResult(CallableStatement cs, int index) throws SQLException {
        log.info("使用我的TypeHandler,CallableStatement下标获取字符串");
        System.out.println("使用我的TypeHandler,ResultSet列名获取字符串");
        return cs.getString(index);
    }
    @Override
    public void setParameter(PreparedStatement ps, int index, String value, JdbcType arg3) throws SQLException {
        log.info("使用我的TypeHandler");
        System.out.println("使用我的TypeHandler,ResultSet列名获取字符串");
        ps.setString(index, value);
    }

}
