package com.example.tanhuan.order.controller;

import com.example.tanhuan.order.pojo.User;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
//import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
//@RefreshScope
public class UserController {
    @RequestMapping("/login")
    @ResponseBody
    public String login(User user){
        //获取subject主体，封装用户信息
        Subject subject= SecurityUtils.getSubject();

        AuthenticationToken authenticationToken=new UsernamePasswordToken(user.getUserName(), user.getPassword());
        try{
            subject.login(authenticationToken);
            return "登录成功";
        }catch (Exception e){
            e.printStackTrace();
            System.err.println("登录失败");
            return "登录失败";
        }
    }
}
