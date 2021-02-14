## 导入依赖

```xml
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.4.2</version>
    </parent>
    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>junit</groupId>
            <artifactId>junit</artifactId>
            <version>4.11</version>
            <scope>test</scope>
        </dependency>
    </dependencies>
```


## 主程序启动 启动Springboot

```java
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

```

## 常见一个 Controller
```java
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
```

直接运行 HelloWorldApplication
访问 127.0.0.1:8080/hello 页面出现 hello world! 字符串

## 创建一个 jar 包
加入插件
```xml
<!--    讲应用打包成运行 jar 包-->
    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
                <version>2.4.2</version>
            </plugin>
        </plugins>
    </build>
```
打包好的东西可以利用 java -jar xxxx.jar 运行
解压可以看淡我们的文件内容

