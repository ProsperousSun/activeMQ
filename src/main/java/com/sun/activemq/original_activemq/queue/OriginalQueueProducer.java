package com.sun.activemq.original_activemq.queue;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.stereotype.Service;

import javax.jms.*;

@Service
public class OriginalQueueProducer {

    public void createOrigianlQueue() throws JMSException {
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
        //会话自动确认机制
        //创建Session，此方法第一个参数表示会话是否在事务中执行，第二个参数设定会话的应答模式
        Session session = connection.createSession(Boolean.TRUE, Session.AUTO_ACKNOWLEDGE);
        //创建目的地，并确认是队列还是主题模式
        Destination original_learn_queue = session.createQueue("original_learn_queue");
        //创建生产者
        MessageProducer producer = session.createProducer(original_learn_queue);
        /**
         *设置生产者的模式，有两种可选
         * DeliveryMode.PERSISTENT 当activemq关闭的时候，队列数据将会被保存
         * DeliveryMode.NON_PERSISTENT 当activemq关闭的时候，队列里面的数据将会被清空
         */
        producer.setDeliveryMode(DeliveryMode.PERSISTENT);
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

        System.out.println("queue信息发送完毕");
        //关闭各个连接
        session.close();
        connection.close();
    }

    public static void main(String[] args) throws JMSException {
        OriginalQueueProducer originalQueueProducer = new OriginalQueueProducer();
        originalQueueProducer.createOrigianlQueue();
    }
}
