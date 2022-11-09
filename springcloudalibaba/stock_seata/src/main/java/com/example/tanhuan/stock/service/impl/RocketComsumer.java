package com.example.tanhuan.stock.service.impl;

import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
import org.apache.rocketmq.spring.core.RocketMQListener;
import org.springframework.stereotype.Service;

import java.lang.annotation.Annotation;

@Service
@RocketMQMessageListener(topic = "topic_01",consumerGroup = "my_topic_01")
public class RocketComsumer implements RocketMQListener<String> {

    public void onMessage(String s) {
        System.out.println("接受到消息:"+s);
    }
}
