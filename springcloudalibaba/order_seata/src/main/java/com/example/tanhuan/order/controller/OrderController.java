package com.example.tanhuan.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
@RefreshScope
public class OrderController {

    @Autowired
    RestTemplate restTemplate;
    @Value("${usr.name}")
    String userName;
    @Value("${usr.age}")
    Integer userAge;
    @Value("${usr.addr}")
    String userAddr;


    @RequestMapping("/add")
    public String add(){
        System.out.println("下单成功");
        String forObject = restTemplate.getForObject("http://stock-service/stock/remveproduct", String.class);
        return "下单成功"+forObject+userName+userAge+userAddr;
    }
}
