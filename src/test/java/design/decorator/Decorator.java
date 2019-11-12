package design.decorator;

/**
 * 类功能说明:  抽象的装饰着类，持有将要被装饰对象的实例
 * 持有一个构件(Component)对象的实例，并定义一个与抽象构件接口一致的接口
 * (默认继承装饰抽象类能够重写被装饰类实现类的方方法)。
 * 类修改者	创建日期2019/10/4
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
public abstract class Decorator implements People  {

    private People people;

    public Decorator(People people){
        this.people = people;
    }

    @Override
    public void wear() {
        people.wear();
    }
}
