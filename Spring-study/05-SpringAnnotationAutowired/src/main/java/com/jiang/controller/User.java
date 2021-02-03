package com.jiang.controller;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// @Component 相当于设置了 <bean id='user' class='com.jiang.controller'/>
@Component
public class User {
    @Value("0xc4m3l") // 实现值注入。
    public String name;
}
