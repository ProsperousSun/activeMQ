package com.sun.activemq.spring_activemq.queue;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class QueueConsumer {
    @Resource
    private JmsTemplate jmsTemplateQueue;

    public void queueConsumer(){

        String str=(String) jmsTemplateQueue.receiveAndConvert();
        System.out.println("接受成功！"+str);
    }
}
