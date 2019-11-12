package design.adapter.demo;

/**
 * 类功能说明: 已经存在的接口，这个接口需要配置
 * 被适配的对象
 * 类修改者	创建日期2019/10/5
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
public class Adaptee {

    /**
     * 原本存在的方法
     */
    public void specificRequest(){
      //业务代码
        System.out.println("业务代码");
    }
}
