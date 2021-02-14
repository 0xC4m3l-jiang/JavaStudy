package com.jiang.java02springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.*;

@ResponseBody  // 这个类的所有方法都会直接返回给浏览器
@Controller

// 上面两个注解可以换成一个
//@RestController
//@Target({ElementType.TYPE})
//@Retention(RetentionPolicy.RUNTIME)
//@Documented
//@Controller
//@ResponseBody
//public @interface RestController {
//里面包含上述 两个注解

public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello world!";
    }
}
