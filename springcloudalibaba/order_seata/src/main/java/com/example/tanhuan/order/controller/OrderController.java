package com.example.tanhuan.order.controller;

import com.example.tanhuan.order.openfeign.service.StockService;
import com.example.tanhuan.order.pojo.Order;
import com.example.tanhuan.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.transaction.annotation.Transactional;
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
    @Autowired
    StockService stockService;
    @Autowired
    OrderService orderService;


    @RequestMapping("/add")
    @Transactional
    public String add(){
        System.out.println("下单成功");
        //String forObject = restTemplate.getForObject("http://stock-service/stock/remveproduct", String.class);
        Order order=new Order();
        order.setOrderNum("2");
        order.setOrderName("第er个订单");
        orderService.addOrder(order);
        String forObject = stockService.remveproduct();
        int i=1/0;
        System.out.println("hello");
        return "下单成功"+forObject+userName+userAge+userAddr;
    }


}
