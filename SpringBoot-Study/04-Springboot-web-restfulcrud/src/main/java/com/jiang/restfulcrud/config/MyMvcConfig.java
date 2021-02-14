package com.jiang.restfulcrud.config;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@EnableWebMvc
@Controller
public class MyMvcConfig implements WebMvcConfigurer {

    // 视图映射
    // 映射 /success 到 /jiang
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/jiang").setViewName("/success");
    }
}
