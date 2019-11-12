package design.adapter.bussiness;

/**
 * 类功能说明: 日志数据对象
 * 考虑一个记录日志的应用，用户可能会提出要求采用文件的方式存储日志，
 * 也可能会提出存储日志到数据库的需求，
 * 这样我们可以采用适配器模式对旧的日志类进行改造，提供新的支持方式。
 * 类修改者	创建日期2019/10/5
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
public class LogBean {

    private String logId;//日志编号
    private String opeUserId;//操作人员

    public String getLogId(){
        return logId;
    }
    public void setLogId(String logId){
        this.logId = logId;
    }

    public String getOpeUserId(){
        return opeUserId;
    }
    public void setOpeUserId(String opeUserId){
        this.opeUserId = opeUserId;
    }
    public String toString(){
        return "logId="+logId+",opeUserId="+opeUserId;
    }
}
