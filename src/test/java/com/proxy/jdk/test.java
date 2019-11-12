package com.proxy.jdk;

import java.lang.reflect.Proxy;

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

       /* UserService userService = new UserServiceImpl();

        UserService proxy = (UserService)  Proxy.newProxyInstance(userService.getClass().getClassLoader(), userService.getClass().getInterfaces(), new UserServiceInvocationHandler(userService));

        proxy.insert(null);*/
        // 保存生成的代理类的字节码文件
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        UserService proxy = new JDKDynamicProxy(new UserServiceImpl()).getProxy();
        proxy.insert(null);
    }
}
