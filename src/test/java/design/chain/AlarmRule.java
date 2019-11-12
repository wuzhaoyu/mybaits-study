package design.chain;

import lombok.Data;

/**
 * 类功能说明:  告警规则
 * 类修改者	创建日期2019/10/17
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
@Data
public class AlarmRule {

    private String name;

    private String type;

    private String threshold;

}
