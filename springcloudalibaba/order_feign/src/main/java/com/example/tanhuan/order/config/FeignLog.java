package com.example.tanhuan.order.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration   这样配置就是全局配置
public class FeignLog {

    @Bean
    public Logger.Level getFeignLog(){
        return Logger.Level.FULL;
    }
}
