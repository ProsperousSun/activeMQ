package com.sun.activemq.spring_activemq.topic;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class TopicConsumer {

    @Resource
    JmsTemplate jmsTemplateTopic;
    public void topicConsumerLearn(){
        String str = (String) jmsTemplateTopic.receiveAndConvert();
        System.out.println("topic模式接受消息");
    }
}
