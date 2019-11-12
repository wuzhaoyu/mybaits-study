package design.adapter.bussiness;

import java.io.File;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * 类功能说明: 实现文件操作
 * 类修改者	创建日期2019/10/5
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
public class LogFileOperate implements LogFileOperateApi{

    /*
     * 设置日志文件的路径和文件名称
     */
    private String logFileName = "file.log";
    /*
     * 构造方法，传入文件的路径和名称
     */
    public LogFileOperate(String logFilename){
        if(logFilename!=null){
            this.logFileName = logFilename;
        }
    }

    @Override
    public List<LogBean> readLogFile() {
        // TODO Auto-generated method stub
        List<LogBean> list = new ArrayList<>();
        ObjectInputStream oin =null;
        //业务代码
        return list;
    }

    @Override
    public void writeLogFile(List<LogBean> list) {
       // TODO Auto-generated method stub
        File file = new File(logFileName);
        ObjectOutputStream oout = null;
        //业务代码
    }
}
