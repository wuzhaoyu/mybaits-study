package design.decorator;

/**
 * 类功能说明: 具体的对象，该对象将被附加一些额外的操作
 * 定义一个将要接收附加责任的类。
 * 类修改者	创建日期2019/10/4
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
public class Jane implements People {

    @Override
    public void wear() {
        System.out.println("今天该穿什么呢?");
    }
}
