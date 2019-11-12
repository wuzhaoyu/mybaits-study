package design.singleton;

/**
 * 类功能说明:
 * 类修改者	创建日期2019/9/26
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
public enum EnumSingle {

    INSTANCE;

    public void doSomeThing() {
        System.out.println("枚举方法实现单例");
    }

    }
