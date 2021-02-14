package com.jly.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// 高数springboot 这是一个 controller
@Controller
public class HelloController {
    // 标志将 helloworld 字符串传回给浏览器
    @ResponseBody
    // 标识路由
    @RequestMapping("/hello")
     public String hello(){
         return "hello world!";
     }

}
