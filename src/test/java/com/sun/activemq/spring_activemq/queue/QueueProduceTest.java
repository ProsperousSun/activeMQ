package com.sun.activemq.spring_activemq.queue;

import com.sun.BaseTest;
import org.junit.Test;

import javax.annotation.Resource;


public class QueueProduceTest extends BaseTest {
    @Resource
    private QueueProduce queueProduce;
    @Test
    public void queueProduceLearn() {
        System.out.println("队列模式的消息发送");
        queueProduce.queueProduceLearn();
        System.out.println("发送完毕");
    }
}