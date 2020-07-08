package order;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.MessageQueueSelector;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageQueue;
import org.apache.rocketmq.remoting.exception.RemotingException;

import java.util.List;

// 顺序消息
public class OrderProducer {
    public static void main(String[] args) throws MQClientException, RemotingException, InterruptedException, MQBrokerException {
        // 制定生产者组
        DefaultMQProducer producer = new DefaultMQProducer("group-1");
        // 制定nameserver 的地址
        producer.setNamesrvAddr("127.0.0.1:9876");
        producer.start();
        for (int i = 0; i < 10; i++) {
            // 创建消息 主题 tag 内容
            Message msg = new Message("base","tag1",i+"1",("Hello Msg"+i).getBytes());
            final int finalI = i;
            producer.send(msg, new MessageQueueSelector() {
                                         // 1 消息队列的集合        发送的消息     业务表示的参数
                public MessageQueue select(List<MessageQueue> mqs, Message msg, Object arg) {
                    System.out.println(arg);
                    System.out.println(mqs.size());
                    return mqs.get( finalI % mqs.size());
                }
            // 传递的业务标示
            }, i);
        }
        producer.shutdown();

    }
}

//  还可以分为批量消息 和 延迟消息

