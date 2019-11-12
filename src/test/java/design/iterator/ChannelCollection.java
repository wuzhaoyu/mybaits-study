package design.iterator;

/**
 * 类功能说明:
 * 类修改者	创建日期2019/9/25
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
public interface ChannelCollection {

     void addChannel(Channel c);

    void removeChannel(Channel c);

    ChannelIterator iterator(ChannelTypeEnum channelTypeEnum);
}
