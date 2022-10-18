package com.example.tanhuan.stock;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stock")
public class StockController {

    @RequestMapping("remveproduct")
    public String remveproduct(){
        System.out.println("删减库存！");
        return "删减库存！";
    }
}
