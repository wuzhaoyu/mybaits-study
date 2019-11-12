package design.chain;

/**
 * 类功能说明: 告警流规则生成
 * 类修改者	创建日期2019/10/17
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
public class StreamGenerateHandler extends AbstractRuleHandler {


    @Override
    public void doHandleReal(AlarmRule rule) throws Exception {
        System.out.println("Generate stream success.");
    }

    @Override
    public void rollbackReal(AlarmRule alarmRule) {
        System.out.println("Roll Generate stream.");
    }
}
