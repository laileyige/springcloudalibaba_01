package com.example.tanhuan.ribbon;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RandomIruleConfig {

    @Bean
    public IRule iRule(){
        return new RandomRule();  //配置随机权限
    }
}
