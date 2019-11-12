package design.adapter.bussiness;

import java.util.List;

/**
 * 类功能说明:
 * 类修改者	创建日期2019/10/5
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
public class LogAdapter implements LogDbOpeApi{

    private LogFileOperateApi logFileOperateApi;

    public LogAdapter(LogFileOperateApi logFileOperateApi){
        this.logFileOperateApi = logFileOperateApi;
    }

    @Override
    public void craeteDb(LogBean logbean) {
        List<LogBean> list = logFileOperateApi.readLogFile();
        list.add(logbean);
        logFileOperateApi.writeLogFile(list);
        System.out.println("数据存储日志文件" + list.toString());
    }
}
