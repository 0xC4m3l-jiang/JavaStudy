package com.jly;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Springboot 注解 告诉springboot这是一个主程序
@SpringBootApplication
public class HelloWorldApplcation {
    public static void main(String[] args) {
        // 启动Spring
        SpringApplication.run(HelloWorldApplcation.class,args);
    }
}
