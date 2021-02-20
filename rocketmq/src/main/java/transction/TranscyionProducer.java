package transction;


import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.LocalTransactionState;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.client.producer.TransactionListener;
import org.apache.rocketmq.client.producer.TransactionMQProducer;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.common.message.MessageExt;
import org.apache.rocketmq.remoting.exception.RemotingException;

// 同步消息发送
public class TranscyionProducer {
    public static void main(String[] args) throws MQClientException, RemotingException, InterruptedException, MQBrokerException {
        // 制定生产者组
        TransactionMQProducer producer = new TransactionMQProducer("group-5");
        // 制定nameserver 的地址
        producer.setNamesrvAddr("127.0.0.1:9876");
        // 设置事务监听器
        producer.setTransactionListener(new TransactionListener() {
            // 在方法中执行本地事务
            public LocalTransactionState executeLocalTransaction(Message msg, Object arg) {
                if (msg.getTags().equals("TAGA")) {
                    return LocalTransactionState.COMMIT_MESSAGE;
                } else if (msg.getTags().equals("TAGB")) {
                    return LocalTransactionState.ROLLBACK_MESSAGE;
                } else if (msg.getTags().equals("TAGC")) {
                    return LocalTransactionState.UNKNOW;
                }
                return LocalTransactionState.UNKNOW;
            }

            // mq回访消息事务
            public LocalTransactionState checkLocalTransaction(MessageExt msg) {
                System.out.println("MQ 回访的消息" + msg.getTags());
                return LocalTransactionState.COMMIT_MESSAGE;
            }
        });

        producer.start();
        String[] strings = {"TAGA", "TAGB", "TAGC"};
        for (int i = 0; i < 3; i++) {
            // 创建消息 主题 tag 内容
            Message msg = new Message("Transction", strings[i], ("Hello Msg" + i).getBytes());
            SendResult result = producer.sendMessageInTransaction(msg, null);
            System.out.println(result.getSendStatus());

        }

    }

}
