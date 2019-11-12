package design.adapter.bussiness;

import java.util.ArrayList;
import java.util.List;

/**
 * 类功能说明:
 * 类修改者	创建日期2019/10/5
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
public class Client {

    public static void main(String[] args) {

        LogBean logbean = new LogBean();
        logbean.setLogId("1");
        logbean.setOpeUserId("michael");
        List<LogBean> list = new ArrayList<LogBean>();
        LogFileOperateApi logFileApi = new LogFileOperate("");
        //创建操作日志的接口对象
        LogDbOpeApi api = new LogAdapter(logFileApi);
        api.craeteDb(logbean);
    }
}
