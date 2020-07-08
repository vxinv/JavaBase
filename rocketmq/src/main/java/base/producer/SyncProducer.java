package base.producer;


import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;
// 同步消息发送
public class SyncProducer {
    public static void main(String[] args) throws MQClientException, RemotingException, InterruptedException, MQBrokerException {
        // 制定生产者组
        DefaultMQProducer producer = new DefaultMQProducer("group-1");
        // 制定nameserver 的地址
        producer.setNamesrvAddr("127.0.0.1:9876");
        producer.start();
        for (int i = 0; i < 10; i++) {
            // 创建消息 主题 tag 内容
            Message msg = new Message("base","tag1",("Hello Msg"+i).getBytes());
            SendResult result = producer.send(msg);
            System.out.println(result.getMsgId());
            System.out.println(result.getSendStatus());
            System.out.println(result.getMessageQueue().getQueueId());

        }
        producer.shutdown();


    }

}
