## 目录结构
**resources/static**
保存静态

**resources/templates**
保存所有模板文件
默认不支持jsp 页面
可以使用模板引擎 thymeleaf等

**application.properties**
Springboot 应用配置文件
可以修改端口号等默认设置

## 配置文件
- application.properties
- application.yml

导入配置文件处理器,绑定会有提示
```xml
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-configuration-processor</artifactId>
            <optional>true</optional>
        </dependency>
```

yml
```yaml
server:
    port:8081

# 类属性定义
# 映射到组件中利用逐渐
# @Component
# @ConfigurationProperties(prefix = "对应yml名字")  比如 a.yml  prefix = "a"
person:
    lastName: aaaaa
    age: 18
    bool: false
    Date: 2020/2/5
    map: {k1: v1,k2: v2}
    list:
      - a
      - b
      - c
    dog:
      name: aaa
      age: 2
```
properties
```properties
server.port=8081

# 类赋值利用 类目.属性 = 值
persion.age=xxx  

```

### 赋值方法
除了上面的方法
还可以利用
@Value

@Value("${person.name}")  可以去 配置文件中的 person.name 找到值
@Value("#{2*12}")  运算后的值

@Email

@Configuration 指明当前类为 spring 配置文件。
利用@Bean 添加组件到容器
spring 配置文件里面的 <Bean> </Bean>

### 配置文件占位符
${random.int} 等


## 配置文件的加载位置
类路径的优先级高低  高优先级覆盖低优先级 上面最高
(项目路径下)
- file:./config/
- file:./
(/src/java下的路径)
- classpath:./config/
- classpath:./

配置文件会互补