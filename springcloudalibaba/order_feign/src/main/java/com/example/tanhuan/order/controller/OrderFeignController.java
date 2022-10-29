package com.example.tanhuan.order.controller;

import com.example.tanhuan.order.feign.stock_nacos.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/order")
public class OrderFeignController {

    @Autowired
    StockService stockService;

    @RequestMapping("/add_1")
    public String add_1(){
        System.out.println("下单成功");
        //这里使用openfeign调用
        String forObject = stockService.remveproduct();
        return "下单成功"+forObject;
    }
}
