package design.chain;

/**
 * 类功能说明:  阈值解析
 * 类修改者	创建日期2019/10/17
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
public class ThresholdParseHandler extends AbstractRuleHandler {

    @Override
    public void doHandleReal(AlarmRule rule) throws Exception {
        if("".equals(rule.getThreshold())){
            throw new Exception("Threshold is empty.");
        }
        System.out.println("Parse threshold 成功. Threshold is " + rule.getThreshold());
    }

    @Override
    public void rollbackReal(AlarmRule alarmRule) {
        System.out.println("Roll parse threshold 回滚. Threshold is " + alarmRule.getThreshold());
    }
}
