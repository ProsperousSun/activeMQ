package com.sun.service;

import com.sun.activemq.spring_activemq.queue.QueueProduce;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class HelloTest {
    @Resource
    private QueueProduce queueProduce;
    public void hello(){
        queueProduce.queueProduceLearn();
        System.out.println("Hello Test!");
    }
}
