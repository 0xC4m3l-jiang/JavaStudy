## 分析
### 父项目
```xml
    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>2.4.2</version>
    </parent>

<!--spring-boot-starter-parent 的内容有个 父类-->
  <parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-dependencies</artifactId>
    <version>2.4.2</version>
  </parent>
<!--这个父项目 真正管理 springboot 里面的版本依赖-->
```

### 依赖
```xml
<!--帮我们导入web 模块运行需要的组件-->
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
```

### 主入口类必须注解

`@SpringBootApplication`