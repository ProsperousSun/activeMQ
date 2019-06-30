package com.sun.activemq.original_activemq.topic;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.stereotype.Service;

import javax.jms.*;

@Service
public class OriginalTopicConsumer {

    public void createOriginalTopicConsumer() throws JMSException {
        ActiveMQConnectionFactory mqConnectionFactory = new ActiveMQConnectionFactory("tcp://106.14.83.42:61616");
        Connection connection = mqConnectionFactory.createConnection();
        connection.start();
        Session session = connection.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE);
        Destination original_learn_topic = session.createTopic("original_learn_topic");
        MessageConsumer consumer = session.createConsumer(original_learn_topic);
        consumer.setMessageListener(new MessageListener() {
            @Override
            public void onMessage(Message message) {
                Message receive = null;
                try {
                    System.out.println("consumer_receieve_topic"+((TextMessage)message).getText());
                } catch (JMSException e) {
                    e.printStackTrace();
                }
            }
        });
        System.out.println("consumer finished!");
        /**
         * ((TextMessage)message).getText()
         * 原生的消息接受
         */

//        while(true){
//            Message receive = consumer.receive();
//            TextMessage txtReceive=(TextMessage)receive;
//            if (txtReceive != null){
//                System.out.println("topic _ receive"+txtReceive.getText());
//            }
//        }
    }

    public static void main(String[] args) throws JMSException {
        OriginalTopicConsumer originalTopicConsumer = new OriginalTopicConsumer();
        originalTopicConsumer.createOriginalTopicConsumer();
    }
}
