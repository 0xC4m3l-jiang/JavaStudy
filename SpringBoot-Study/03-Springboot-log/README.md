## 日志框架

### 市面上的框架
JUL JCL Jboss-logging logback log4j log4j2 slf4j
抽象层：   
    JCL  SLF4j  Jboss-logging
日志实现：
    Log4j JUL log4j2
    
springboot 使用的 SLF4J 和 logback

### 使用
调用日志抽象层的方法
每一个日志的实现框架都有自己的配置文件。

需要依赖
```xml
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-logging</artifactId>
        </dependency>
```
使用 starter-logging 的分析

使用里面的 logback 记录日志
存在 jul-to-slf4j log4j-over-slf4j jcl-over-slf4j  将其他日志转为 slf4j

最后 logback jul-to-slf4j log4j-over-slf4j jcl-over-slf4j 导入 sl4j 抽象层

### 测试
需要import 的包为
```java
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
```


```java
    void contextLoads() {
        // 日志的级别 由低到高
        // 调整日志级别
        logger.trace("这是trace 日志");
        logger.debug("这是debug 日志");
        logger.info("这是 info 日志");
        logger.warn("这是 warn 日志");
        logger.error("这只error 日志");
    }
```
默认为 info 级别 输出 Info 及其以上的级别日志

利用好 配置文件
`application.properties` 来修改我们的显示级别
logging.level.com.jiang = trace

`logging.file` 对应路径生成 log 文件 指定文件名
`logging.path` 对应路径生成 log 文件 指定文件路径
`logging.pattern.console`  生成的日志格式
`logging.pattern.file`   只能日志输出格式
