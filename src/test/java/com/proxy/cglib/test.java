package com.proxy.cglib;
/**
 * 类功能说明:
 * 类修改者	创建日期2019/9/15
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
public class test {

    public static void main(String[] args){

        CglibProxy proxy = new CglibProxy();

        UserServiceImpl userService = (UserServiceImpl)proxy.getProxy(UserServiceImpl.class);

        userService.insert(null);
    }
}
