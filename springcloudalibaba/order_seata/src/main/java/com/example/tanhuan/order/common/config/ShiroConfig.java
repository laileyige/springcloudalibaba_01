package com.example.tanhuan.order.common.config;

import com.example.tanhuan.order.realm.MyRealm;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.authc.pam.ModularRealmAuthenticator;
import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
import org.apache.shiro.spring.web.config.ShiroWebFilterConfiguration;
import org.apache.shiro.util.ThreadContext;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import static com.alibaba.druid.sql.ast.SQLPartitionValue.Operator.List;

@Configuration
public class ShiroConfig {
    @Autowired
    MyRealm myRealm;

    @Bean
    public DefaultWebSecurityManager defaultWebSecurityManager(){
        //1.创建web安全管理器
        DefaultWebSecurityManager manager=new DefaultWebSecurityManager();
        //2.创建加密对象11
        HashedCredentialsMatcher matcher=new HashedCredentialsMatcher();
        matcher.setHashAlgorithmName("md5");
        matcher.setHashIterations(3);
        //3.将加密对象给myrealm
        myRealm.setCredentialsMatcher(matcher);
        /*//多realm认证
        ModularRealmAuthenticator modularRealmAuthenticator=new ModularRealmAuthenticator();
        modularRealmAuthenticator.setAuthenticationStrategy("认证策略");
        manager.setAuthenticator(modularRealmAuthenticator);
        manager.setRealms(List<MyRealm>);*/
        //4.将myrealm给安全关联
        manager.setRealm(myRealm);
        ThreadContext.bind(manager);
        return manager;
    }

    @Bean//shiro拦截器
    public DefaultShiroFilterChainDefinition defaultShiroFilterChainDefinition(){
        DefaultShiroFilterChainDefinition definition=new DefaultShiroFilterChainDefinition();
        //不拦截
        definition.addPathDefinition("user/login","anon");
        //登出功能,直接到登录页面   配置文件需要配置login页面，就会自动定位到登录
        definition.addPathDefinition("user/logout","logout");
        //拦截
        //definition.addPathDefinition("/**","authc");
        return definition;
    }
}
