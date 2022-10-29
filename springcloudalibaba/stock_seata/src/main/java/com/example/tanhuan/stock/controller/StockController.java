package com.example.tanhuan.stock.controller;

import com.example.tanhuan.stock.pojo.Stock;
import com.example.tanhuan.stock.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockController {
    @Value("${server.port}")
    String port;
    @Autowired
    StockService stockService;

    @RequestMapping("remveproduct")
    public String remveproduct(){
        Stock stock=new Stock("2","2",null,null);
        stock.setStockId(3);
        stockService.insertStock(stock);
        return "删减库存！"+port;
    }
}
