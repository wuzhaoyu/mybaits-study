package design.iterator;

/**
 * 类功能说明:让我们通过一个简单的例子来理解迭代器模式。
 * 假设我们有一个无线电信道列表，并且客户端程序希望逐个或基于信道类型遍历它们。
 * 例如，一些客户端程序仅对英语频道感兴趣并且想要仅处理它们，他们不想处理其他类型的频道。
 * Channel是一个简单的POJO类，具有属性频率和通道类型
 * 类修改者	创建日期2019/9/25
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
public class Channel {

    private double frequency;
    private ChannelTypeEnum TYPE;

    public Channel(double freq, ChannelTypeEnum type){
        this.frequency=freq;
        this.TYPE=type;
    }

    public double getFrequency() {
        return frequency;
    }

    public ChannelTypeEnum getTYPE() {
        return TYPE;
    }

    @Override
    public String toString(){
        return "Frequency="+this.frequency+", Type="+this.TYPE;
    }

}
