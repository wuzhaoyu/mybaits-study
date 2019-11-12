package design.decorator;

/**
 * 类功能说明:
 * 1.抽象构件(Component)角色：给出一个抽象接口，以规范准备接收附加责任的对象。
 * 2.具体构件(ConcreteComponent)角色：定义一个将要接收附加责任的类。
 * 3.装饰(Decorator)角色：持有一个构件(Component)对象的实例，并定义一个与抽象构件接口一致的接口。
 * 4.具体装饰(ConcreteDecorator)角色：负责给构件对象“贴上”附加的责任。
 * ————————————————
 *  装饰者模式：动态地将责任附加到对象上。想要扩展功能， 装饰者提供有别于继承的另一种选择。
 * @author wzy
 * @version V1.0
 **/
public class Test {

    public static void main(String[] args){
        // People 被装饰接类口
        // Jane 接收附加责任的类
        // Decorator() 桥梁
        People people = new DecoratorShirt(new DecoratorSuit(new Jane()));

        people.wear();


    }
}
