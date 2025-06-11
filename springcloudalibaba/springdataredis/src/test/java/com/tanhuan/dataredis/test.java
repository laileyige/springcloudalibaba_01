package com.tanhuan.dataredis;

import com.alibaba.fastjson.JSON;
import com.example.tanhuan.DataRedisApplication;
import com.example.tanhuan.pojo.User;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest(classes = DataRedisApplication.class)
@RunWith(SpringRunner.class)
public class test {

    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void stringSet(){
        redisTemplate.opsForValue().set("user:4",new User("tanhuan",39,"湖北黄冈"));
        User o = (User)redisTemplate.opsForValue().get("user:1");
        System.out.println(o);
    }

    @Test
    public void jsonStringSet(){
        String s = JSON.toJSONString(new User("廖勇", 80, "洪湖"));
        stringRedisTemplate.opsForValue().set("jsonuser:1",s);
        String s1 = stringRedisTemplate.opsForValue().get("jsonuser:1");
        System.out.println(s1);
    }

    @Test
    public void md5password(){
        Md5Hash md5Hash=new Md5Hash("lisi","salt",3);
        System.out.println(md5Hash.toHex());
        Md5Hash md5Hash1=new Md5Hash("zhangsan","salt",3);
        System.out.println(md5Hash1.toHex());
    }
}
