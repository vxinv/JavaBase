package base.producer;

import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendCallback;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.remoting.exception.RemotingException;

// 异步消息发送
// 通常用在对消息敏感的业务场景 可以指定回调函数来实现异步处理
public class AsyncProducer {
    public static void main(String[] args) throws MQClientException, RemotingException, InterruptedException, MQBrokerException {

        // 制定生产者组
        DefaultMQProducer producer = new DefaultMQProducer("group-1");
        // 制定nameserver 的地址
        producer.setNamesrvAddr("127.0.0.1:9876");
        producer.start();

        for (int i = 0; i < 10; i++) {
            // 创建消息 主题 tag 内容
            Message msg = new Message("base","tag2",("Hello Msg"+i).getBytes());
            producer.send(msg, new SendCallback() {
                public void onSuccess(SendResult sendResult) {
                    System.out.println(sendResult.getMsgId());
                    System.out.println(sendResult.getSendStatus());
                    System.out.println(sendResult.getMessageQueue().getQueueId());
                }

                public void onException(Throwable e) {
                    System.out.println("发送失败"+e.getMessage());
                }
            });

        }

        //producer.shutdown();

    }
}
