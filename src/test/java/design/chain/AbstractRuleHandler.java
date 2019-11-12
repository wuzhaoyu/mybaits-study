package design.chain;

/**
 * 类功能说明: 类功能说明: 告警规则责任链处理节点抽象类
 * 类修改者	创建日期2019/10/17
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
public abstract class AbstractRuleHandler {

    //上一处理器
    private AbstractRuleHandler preHandler;

    //下一处理器
    private AbstractRuleHandler nextHandler;

    /**
     * 业务执行
     * @param rule
     */
    public void doHandle(AlarmRule rule){
        try{
            doHandleReal(rule);
        }catch (Exception e){
            rollback(rule);
        }
        if(null != nextHandler){
            nextHandler.doHandle(rule);
        }
    }


    /**
     * 事务回滚
     * @param rule
     */
    public void rollback(AlarmRule rule){

        try {
            rollbackReal(rule);
        }catch (Exception e){

        }
        if(null != preHandler){
            preHandler.rollback(rule);
        }
    }

    /**
     * 每个处理器特有的业务处理方法
     * @param rule
     * @throws Exception
     */
    public abstract void doHandleReal(AlarmRule rule) throws Exception;


    /**
     * 每个处理器特有的业务回滚方法
     * @param alarmRule
     */
    public abstract void rollbackReal(AlarmRule alarmRule);


    public void setPreHandler(AbstractRuleHandler handler){
        this.preHandler = handler;
    }

    public AbstractRuleHandler setNextHandler(AbstractRuleHandler nextHandle){
        this.nextHandler = nextHandle;
        setPreHandler(this);
        return nextHandle;

    }
}
