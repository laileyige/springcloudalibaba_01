package com.example.tanhuan.order;

import com.example.tanhuan.ribbon.RandomIruleConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonClients;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@RibbonClients(value = {@RibbonClient(name = "stock-service",configuration = RandomIruleConfig.class)})
@EnableFeignClients
@MapperScan("com.example.tanhuan.order.mapper")
class OrderSeataApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderSeataApplication.class,args);
    }

    @Bean
    @LoadBalanced //负载均衡器，默认是轮询方式，调用时必须加上该注解，不然nacos无法识别被调用方给到那个服务
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder){
        return restTemplateBuilder.build();
    }
}
