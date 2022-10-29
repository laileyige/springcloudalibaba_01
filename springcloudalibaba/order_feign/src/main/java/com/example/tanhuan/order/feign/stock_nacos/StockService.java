package com.example.tanhuan.order.feign.stock_nacos;

import com.example.tanhuan.order.config.FeignLog;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "stock-service",path = "/stock",configuration = FeignLog.class)//具体指定调用哪个服务打印日志
//名称与stock-service服务所对应的controller名称，最好是相同
public interface StockService {

    @RequestMapping("/remveproduct")
    String remveproduct();

}
