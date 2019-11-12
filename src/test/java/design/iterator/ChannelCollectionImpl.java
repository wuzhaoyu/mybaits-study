package design.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 类功能说明:
 * 类修改者	创建日期2019/9/25
 * 修改说明
 *
 * @author wzy
 * @version V1.0
 **/
public class ChannelCollectionImpl implements ChannelCollection {

    private List<Channel> channelsList;

    public ChannelCollectionImpl() {
        channelsList = new ArrayList<>();
    }

    public void addChannel(Channel c) {
        this.channelsList.add(c);
    }

    public void removeChannel(Channel c) {
        this.channelsList.remove(c);
    }


    @Override
    public ChannelIterator iterator(ChannelTypeEnum channelTypeEnum) {
        return new ChannelIteratorImpl(channelTypeEnum,channelsList);
    }

    private class ChannelIteratorImpl implements ChannelIterator{

        private ChannelTypeEnum channelTypeEnum;
        private List<Channel> channels;
        private int position;

        public ChannelIteratorImpl(ChannelTypeEnum ty,
                                   List<Channel> channelsList) {
            this.channelTypeEnum = ty;
            this.channels = channelsList;
        }

        @Override
        public boolean hasNext() {
            while (position < channels.size()) {
                Channel c = channels.get(position);
                if (c.getTYPE().equals(channelTypeEnum) || channelTypeEnum.equals(ChannelTypeEnum.ALL)) {
                    return true;
                } else
                    position++;
            }
            return false;
        }

        @Override
        public Channel next() {
            Channel c = channels.get(position);
            position++;
            return c;

        }
    }
}
