package design.adapter.demo;

/**
 * 类功能说明:
 * 类修改者	创建日期2019/10/5
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
public class Client {

    public static void main(String[] args){
        Target target =  new Adapter(new Adaptee());
        target.request();
    }
}
