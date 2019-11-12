package com.proxy.collect;

import com.pojo.Role;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 类功能说明:
 * 类修改者	创建日期2019/9/18
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
public class test1 {

    @Test
    public void test11(){

        ArrayList<Role> array = new ArrayList<Role>();

        Role p1 = new Role("Tom1");
        Role p2 = new Role("Tom2");
        Role p3 = new Role("Tom3");
        Role p4 = new Role("Tom4");

        array.add(p1);
        array.add(p2);
        array.add(p3);
        array.add(p4);

        Iterator<Role> iterator = array.iterator();

        for (Role pp : array){
            System.out.println(pp.getName());
        }



        System.out.println("\r\n" + "-----利用for循环-----" + "\r\n");
        for(Role p : array){
            p.setName("wang");
        }

        while(iterator.hasNext()){
            System.out.println(iterator.next().getName()); //输出的是wang，而不是tom
        }

    }
}
