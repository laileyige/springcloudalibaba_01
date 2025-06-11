package com.example.tanhuan.jedis.test;

import com.example.tanhuan.jedis.common.JedisUtil;
import redis.clients.jedis.Jedis;

import java.util.HashMap;
import java.util.Map;

public class JedisTes {
    private static Jedis jedis;
    static {
        jedis = new Jedis("localhost");
        jedis.select(6);
    }

    public static void main(String[] args) {
        Jedis jedis= JedisUtil.getJedis();
        jedis.select(5);
        String result = jedis.set("user:2", "你是个傻逼");
        System.out.println(result);
        jedis.hset("user:3","name","redis版本太低，不特么支持map");
        System.out.println(jedis.hget("user:3","name"));
        System.out.println(jedis.hgetAll("user:3"));
        Map<String, String> map=new HashMap();
        map.put("name","谈欢");
        map.put("age","28");
        jedis.hset("user:3", map);

    }
}
