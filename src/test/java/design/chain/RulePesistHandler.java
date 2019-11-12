package design.chain;

/**
 * 类功能说明:  告警规则持久化
 * 类修改者	创建日期2019/10/17
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
public class RulePesistHandler extends AbstractRuleHandler {
    @Override
    public void doHandleReal(AlarmRule rule) throws Exception {
        if("".equals(rule.getName()))
        {
            throw new Exception("Rule name is empty.");
        }
        System.out.println("Persist rule success. Rule name is " + rule.getName());
    }

    @Override
    public void rollbackReal(AlarmRule alarmRule) {
        System.out.println("Roll persist rule. Rule name is " + alarmRule.getName());
    }
}
