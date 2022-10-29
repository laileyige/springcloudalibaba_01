package com.example.tanhuan.stock;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockController {
    @Value("${server.port}")
    String port;

    @RequestMapping("remveproduct")
    public String remveproduct(){
        System.out.println("删减库存！");
        return "删减库存！"+port;
    }
}
