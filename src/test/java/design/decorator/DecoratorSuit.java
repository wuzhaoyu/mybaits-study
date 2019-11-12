package design.decorator;

/**
 * 类功能说明: 具体的装饰类
 * 类修改者	创建日期2019/10/4
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
public class DecoratorSuit extends Decorator {

    public DecoratorSuit(People people) {
        super(people);
    }

    public void wear(){
        super.wear();
        wear1();
    }

    public void wear1(){
        System.out.println("穿西服");
    }
}
