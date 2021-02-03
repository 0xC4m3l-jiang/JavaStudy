package com.jiang.config;

import com.jiang.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 本身就是一个配置  会被Spring 注册到容器中，本来就是一个 @Component (本身有个这个注解
// @Configuration 代表一个配置类， 对应 beans.xml
@Configuration
public class jiangConfig {

    // 注册一个 bean 相当于
    // <bean id='' class=''/>
    @Bean
    public User User() {
        return new User();
    }
}
