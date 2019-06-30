package com.sun.activemq.original_activemq.queue;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.springframework.stereotype.Service;

import javax.jms.*;

@Service
public class OriginalQueueConsumer {

    public void createOriginalQueueConsumer() throws JMSException {
        ActiveMQConnectionFactory mqConnectionFactory = new ActiveMQConnectionFactory("tcp://106.14.83.42:61616");
        Connection connection = mqConnectionFactory.createConnection();
        connection.start();
        Session session = connection.createSession(Boolean.FALSE, Session.AUTO_ACKNOWLEDGE);
        Destination original_learn_queue = session.createQueue("original_learn_queue");
        MessageConsumer consumer = session.createConsumer(original_learn_queue);
        consumer.setMessageListener(new MessageListener() {
            @Override
            public void onMessage(Message message) {
                    Message receive = null;
                    try {
                        System.out.println("consumer_receieve_queue"+((TextMessage)message).getText());
                    } catch (JMSException e) {
                        e.printStackTrace();
                    }
                }
        });
        System.out.println("consumer finished!");
        /**
         * ((TextMessage)message).getText()
         */
    }

    public static void main(String[] args) throws JMSException {
        OriginalQueueConsumer originalQueueConsumer = new OriginalQueueConsumer();
        originalQueueConsumer.createOriginalQueueConsumer();
    }
}
