package com.example.tanhuan;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.example.tanhuan.stock.mapper")
public class StockSeataApplication {
    public static void main(String[] args) {
        SpringApplication.run(StockSeataApplication.class,args);
    }
}
