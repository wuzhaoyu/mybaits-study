package com.proxy.defaultt;

/**
 * 类功能说明:
 * 类修改者	创建日期2019/9/19
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
 interface Animal {
    /**
     * 活动
     * */
    void play();

     default public  void eat(){
        System.out.println("它什么都吃！");
    }

}
