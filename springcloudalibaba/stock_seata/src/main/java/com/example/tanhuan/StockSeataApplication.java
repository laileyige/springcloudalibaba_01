package com.example.tanhuan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class StockSeataApplication {
    public static void main(String[] args) {
        SpringApplication.run(StockSeataApplication.class,args);
    }
}
