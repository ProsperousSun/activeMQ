package com.sun.activemq.original_activemq.topic;

import com.sun.activemq.original_activemq.queue.OriginalQueueProducer;
import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.stereotype.Service;

import javax.jms.*;

@Service
public class OriginalTopicProducer {
    public void createOrigianlTopic() throws JMSException {
        ActiveMQConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://106.14.83.42:61616");
        Connection connection = connectionFactory.createConnection();
        //开启连接，启动连接
        connection.start();
        /**
         *     int AUTO_ACKNOWLEDGE = 1;
         *     int CLIENT_ACKNOWLEDGE = 2;
         *     int DUPS_OK_ACKNOWLEDGE = 3;
         *     int SESSION_TRANSACTED = 0;
         */
        /**
         * //第二个参数为false时，paramB的值可为Session.AUTO_ACKNOWLEDGE，Session.CLIENT_ACKNOWLEDGE，DUPS_OK_ACKNOWLEDGE其中一个。
         *   Session.AUTO_ACKNOWLEDGE为自动确认，客户端发送和接收消息不需要做额外的工作。哪怕是接收端发生异常，也会被当作正常发送成功。
         *   Session.CLIENT_ACKNOWLEDGE为客户端确认。客户端接收到消息后，必须调用javax.jms.Message的acknowledge方法。jms服务器才会当作发送成功，并删除消息。
         *   DUPS_OK_ACKNOWLEDGE允许副本的确认模式。一旦接收方应用程序的方法调用从处理消息处返回，会话对象就会确认消息的接收；而且允许重复确认。
         *
         */
        //会话自动确认机制
        //创建Session，此方法第一个参数表示会话是否在事务中执行，第二个参数设定会话的应答模式
        Session session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
        //创建目的地，并确认是队列还是主题模式
        Destination original_learn_topic = session.createTopic("original_learn_topic");
        //创建生产者
        MessageProducer producer = session.createProducer(original_learn_topic);
        //创建发送的文本信息
        TextMessage textMessage = session.createTextMessage("***---orgianl_learn_queue_message---***");
        //发送信息
        producer.send(textMessage);
        /**
         * 如果session是以事务的方式创建必须session.commit()就可以将消息提交到服务器队列
         *         Session session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
         *如果session是以非事务的方式创建必须session.close()就可以将消息提交到服务器队列
         *         Session session = connection.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE);

         * 如果会话创建 是事务，则需要commit
         * 如果不是事务 ， 那么可以session.close()默认提交
         */
        //如果没有 commit，那么队列里面不会有任何的东西
        session.commit();

        System.out.println("topic信息发送完毕");
        //关闭各个连接
        session.close();
        connection.close();
    }

    public static void main(String[] args) throws JMSException {
        OriginalTopicProducer originalTopicProducer = new OriginalTopicProducer();
        originalTopicProducer.createOrigianlTopic();
    }
}
