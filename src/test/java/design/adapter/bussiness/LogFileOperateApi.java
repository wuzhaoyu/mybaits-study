package design.adapter.bussiness;

/**
 * 类功能说明: 日志文件操作的API
 * 类修改者	创建日期2019/10/5
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/

import java.util.List;

/**
 * 读取日志文件，从文件里面获取存储的日志列表对象
 * @return 存储的日志列表对象
 */
public interface LogFileOperateApi {

     List<LogBean> readLogFile();
    /**
     * 写日志文件，把日志列表写出到日志文件中去
     * @param list 要写到日志文件的日志列表
     */
     void writeLogFile(List<LogBean> list);
}
