package com.sun.activemq.spring_activemq.topic;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.jms.TextMessage;

@Service
public class TopicProduce {
    @Resource
    JmsTemplate jmsTemplateTopic;
    public void topicProduceLearn(){
        jmsTemplateTopic.send((session -> {
            TextMessage textMessage = session.createTextMessage("topic-主题发送消息----learn");
            return textMessage;
        }));
        System.out.println("主题topic发送完毕！");
    }
}
