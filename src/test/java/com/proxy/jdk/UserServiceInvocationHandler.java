package com.proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 类功能说明:
 * 类修改者	创建日期2019/9/15
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
public class UserServiceInvocationHandler implements InvocationHandler {

    private UserService userService;

    public UserServiceInvocationHandler(UserService userService){
        this.userService = userService;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("前置增强！");
        Object invoke1 = method.invoke(userService, args);
        System.out.println("后置增强！");
        return invoke1;
    }
}
