package com.sun.activemq.spring_activemq.queue;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.TextMessage;

@Service
public class QueueProduce {
    @Resource
    private JmsTemplate jmsTemplateQueue;

    public void queueProduceLearn(){
//        jmsTemplate.send(new MessageCreator() {
//            @Override
//            public Message createMessage(Session session) throws JMSException {
//                TextMessage textMessage = session.createTextMessage("*----spring-learn-queue-----*");
//                return textMessage;
//            }
//        });
        jmsTemplateQueue.send((session -> {
            TextMessage textMessage = session.createTextMessage("*----spring-learn-queue-----*");
            return textMessage;
        }));
    }
}
