package com.proxy.defaultt;

/**
 * 类功能说明:
 * 类修改者	创建日期2019/9/19
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
public class Pet implements Animal {
    @Override
    public void play() {
        System.out.println("玩");
    }

    public static void main(String[] args){
        Pet p = new Pet();
        p.eat();
    }
}
