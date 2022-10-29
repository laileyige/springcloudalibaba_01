package com.example.tanhuan.order.openfeign.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "stock-seata-service",path = "stock")
public interface StockService {
    @RequestMapping("remveproduct")
    public String remveproduct();
}
