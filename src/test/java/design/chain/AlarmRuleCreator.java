package design.chain;

import lombok.AllArgsConstructor;

/**
 * 类功能说明:
 * 类修改者	创建日期2019/10/17
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
public class AlarmRuleCreator {

    private AbstractRuleHandler alarmRuleHandler;

    public AlarmRuleCreator(){
        alarmRuleHandler = new ThresholdParseHandler();
        alarmRuleHandler.setNextHandler(new StreamGenerateHandler())
                .setNextHandler(new RulePesistHandler());

    }
    public void create(AlarmRule rule)
    {
        alarmRuleHandler.doHandle(rule);
    }
    public static void main(String[] args) {
        AlarmRule rule = new AlarmRule();
        rule.setThreshold("cpuRate < 10");
        rule.setName("Cpu Alarm");

        AlarmRuleCreator alarmRuleCreator = new AlarmRuleCreator();
//        alarmRuleCreator.create(rule);

        System.out.println();

        rule.setName("");
        alarmRuleCreator.create(rule);

    }
}
