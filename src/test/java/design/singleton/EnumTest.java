package design.singleton;

/**
 * 类功能说明:
 * 类修改者	创建日期2019/9/26
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
public class EnumTest {

    public static void main(String[] args){
        EnumSingle enumSingle = EnumSingle.INSTANCE;
        EnumSingle enumSingle1 = EnumSingle.INSTANCE;
        System.out.println(enumSingle == enumSingle1);
        enumSingle.doSomeThing();
        System.out.println(enumSingle.name());
        System.out.println(enumSingle.ordinal());
    }
}
