package com.example.tanhuan.config;

import com.fasterxml.jackson.databind.JsonSerializer;
import io.lettuce.core.ReadFrom;
import org.springframework.boot.autoconfigure.data.redis.LettuceClientConfigurationBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.lettuce.LettuceClientConfiguration;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.RedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

@Configuration
public class RedisTemplateConfig {
    @Bean
    public RedisTemplate<Object, Object> redisTemplate(RedisConnectionFactory connectionFactory) {
        RedisTemplate<Object, Object> objectObjectRedisTemplate = new RedisTemplate<>();
        objectObjectRedisTemplate.setKeySerializer(new StringRedisSerializer());
        objectObjectRedisTemplate.setHashKeySerializer(new StringRedisSerializer());
        objectObjectRedisTemplate.setValueSerializer(RedisSerializer.json());
        objectObjectRedisTemplate.setHashValueSerializer(RedisSerializer.json());
        objectObjectRedisTemplate.setConnectionFactory(connectionFactory);

        return objectObjectRedisTemplate;
    }

    @Bean
    public LettuceClientConfigurationBuilderCustomizer configurationBuilderCustomizer() {
        return new LettuceClientConfigurationBuilderCustomizer() {
            @Override
            public void customize(LettuceClientConfiguration.LettuceClientConfigurationBuilder clientConfigurationBuilder) {
                clientConfigurationBuilder.readFrom(ReadFrom.REPLICA_PREFERRED);
            }
        };
    }

}
