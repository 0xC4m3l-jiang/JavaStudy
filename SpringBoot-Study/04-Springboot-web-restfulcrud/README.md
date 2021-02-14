## 静态资源映射规则
1）所有 `/webjars/*` 都去 `classpath:/META-INF/resources/webjars/` 找资源
    webjars jar包形式引入静态资源
    
2）`/**` 访问当前项目的任意资源
    classpath:/META-INF/resources/ 
    classpath:/resources/
    classpath:/static/
    classpath:/public/
    / 当前根目录

3）resource 目录下的 index.html 会被映射到 `/` 目录
    例：/resources/public/index.html
    我们可以直接访问 `ip:port/`  访问index.html 页面
    
4）favicon.ico 也会直接被映射    

引入 jquery
访问的时候只需要写webjars下资源的名称
```xml
        <dependency>
            <groupId>org.webjars</groupId>
            <artifactId>jquery</artifactId>
            <version>3.3.1</version>
        </dependency>
```
**ip:port/webjars/jquery/version/jquery.js**


## Thymeleaf 魔板引擎

### 引入 Thymeleaf
```xml
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-thymeleaf</artifactId>
        </dependency>
```

### Thymeleaf 语法
`ThymeleafProperties`  保存对应的模板规则 
把html页面放在 classpath:/templates/ 下 thymeleaf就能自动渲染了

比如我们创建路由 success
```java
    @RequestMapping("/success")
    public String success(){
        // 这里回去访问 classpath:/templates/success.html
        return "success";
    }
```
访问这个路由时会自动渲染访问。
`classpath:/templates/success.html`

html 文件中加入 名称空间
`<html lang="en" xmlns:th="http://www.thymeleaf.org">`
使用语法  从而显示
success 路由
```java
    // 查出数据在页面展示
    @RequestMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","你好");
        // 这里回去访问 classpath:/templates/success.html
        return "success";
    }
```
success.html
```html
<!--    th:text  设置div 里面的文本-->
    <div th:text="${hello}"></div>
```

### 规则
命名空间
`<html lang="en" xmlns:th="http://www.thymeleaf.org">`

`th:任意属性`  偷换原生属性的值 

${变量}  
    获取变量的值   
    还能进行方法调用  如 ${person.say("hi")}
    ${#xxx} 调用内置对象 xxx  或利用内容工具对象
    
*{} 配置 th:object 使用

\#{} 获取国际化内容

@{(需要带入的变量)} 定义url 链接

~{xxx}  片段文档

支持 数字运算 布尔运算 比较运算 条件运算

[[]] 为 th:text 会转义特殊字符
[()] 为 th:utext 不会转义特殊字符


### springmvc 扩展
```xml
<!--        访问 /hello 也会放回 /success 页面-->
        <mvc:view-controller path="/hello" view-name="/success"/>
<!--    mvc 拦截器-->
        <mvc:interceptors>
            <mvc:interceptor>
                <mvc:mapping path="/hello"/>
<!--                利用 <bean> 拦截器拦截 /hello-->
                <bean> </bean>
            </mvc:interceptor>
        </mvc:interceptors>
```

编写 配置类 
`@Coniguration`  是 WebMvcConfigurerAdapter 类型


MyMvcConfig
```java
implements WebMvcConfigurer
```

### 全面接管 SpringMVC
需要在配置类添加 `@EnableWebMvc`

所有 mvc 的自动配置都失效了
```java
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
```
失败的原因
```java
@Import({DelegatingWebMvcConfiguration.class})
public @interface EnableWebMvc {
}
```
```java
public class DelegatingWebMvcConfiguration extends WebMvcConfigurationSupport
```

WebMvcAutoConfiguration
```java
@Configuration(
    proxyBeanMethods = false
)
@ConditionalOnWebApplication(
    type = Type.SERVLET
)
@ConditionalOnClass({Servlet.class, DispatcherServlet.class, WebMvcConfigurer.class})
// 容器中没有这个组件时，这个自动配置类才回失效
@ConditionalOnMissingBean({WebMvcConfigurationSupport.class})
@AutoConfigureOrder(-2147483638)
@AutoConfigureAfter({DispatcherServletAutoConfiguration.class, TaskExecutionAutoConfiguration.class, ValidationAutoConfiguration.class})
public class WebMvcAutoConfiguration
```

EnableWebMvc 将  WebMvcConfigurationSupport 导入