package com.proxy.cglib;

import net.sf.cglib.proxy.*;
import org.junit.Test;

import java.lang.reflect.Method;

/**
 * 类功能说明: 使用CGlib代理
 * 类修改者	创建日期2019/9/15
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
public class SampleTest {

    public  String test(){
        return "hello world";
    }

    @Test
    public void testFixedValue(){
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(SampleTest.class);
        enhancer.setCallback(new FixedValue() {
            public Object loadObject() throws Exception {
                return "i love you ";
            }
        });

        SampleTest proxy = (SampleTest) enhancer.create();

        System.out.println(proxy.test());
        System.out.println(proxy.toString());
        System.out.println(proxy.getClass());
        System.out.println(proxy.hashCode());

    }

    public static void main(final String[] args){
        Enhancer enhancer = new Enhancer();
        //设置生成代理类子类的父类
        enhancer.setSuperclass(SampleTest.class);
        enhancer.setCallback(new MethodInterceptor() {
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
                System.out.println("前置增强");
                Object o1 = methodProxy.invokeSuper(o, objects);
                System.out.println("后置增强");
                return o1;
            }
        });

        SampleTest sampleTest = (SampleTest)enhancer.create();

        sampleTest.test();
    }

}
