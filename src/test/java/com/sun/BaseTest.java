package com.sun;

import com.sun.activemq.spring_activemq.queue.QueueConsumer;
import com.sun.activemq.spring_activemq.queue.QueueProduce;
import com.sun.activemq.spring_activemq.topic.TopicConsumer;
import com.sun.activemq.spring_activemq.topic.TopicProduce;
import com.sun.service.HelloTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring配置文件的位置
//在这个contextconfiguration下的classpath下不能添加 springmvc的 配置文件，添加springmvc的配置文件会加载不过来无法转换handler
@ContextConfiguration({"classpath:ssm/spring-service.xml",
"classpath:ssm/spring-mybaties.xml","classpath:ssm/dispacther-servlet.xml"})
public class BaseTest {
    @Resource
    private HelloTest helloTest;

    @Resource
    private QueueProduce queueProduce;

    @Resource
    private QueueConsumer queueConsumer;

    /**
     * 队列模式的发送消息的Test
     */
    @Test
    public void queueProduceTest(){
        System.out.println("ooo");
        queueProduce.queueProduceLearn();
        System.out.println("发送完毕");
    }

    @Test
    public void   queueConsumer(){
        queueConsumer.queueConsumer();
    }

//    ----------------------------------Topic----------------------

    @Resource
    private TopicProduce topicProduce;
    @Resource
    private TopicConsumer topicConsumer;

    /**
     * 主题模式测试
     */
    @Test
    public void topicProduce(){
        topicProduce.topicProduceLearn();
    }

    /**
     * 先启动 消费者，在启动生产者
     */
    @Test
    public void topicConsumer(){
        topicConsumer.topicConsumerLearn();
        System.out.println("接受消息了！");
    }
}
