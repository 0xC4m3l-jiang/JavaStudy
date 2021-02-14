package com.evan.jiang.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity // 对实体注释。
@Table(name = "user")  // 使用的是数据库的 user 表。

// 这个注解写在类上之后，就会忽略类中不存在的字段，可以满足当前的需要。这个注解还可以指定要忽略的字段。
//因为是做前后端分离，而前后端数据交互用的是 json 格式。
// 那么 User 对象就会被转换为 json 数据。
// 而本项目使用 jpa 来做实体类的持久化，jpa 默认会使用 hibernate, 在 jpa 工作过程中，
// 就会创造代理类来继承 User ，并添加 handler 和 hibernateLazyInitializer
// 这两个无须 json 化的属性，所以这里需要用 JsonIgnoreProperties 把这两个属性忽略掉。
@JsonIgnoreProperties({"handler","hibernateLazyInitializer"})


public class User {
    @Id // 标注用于声明一个实体类的属性映射为数据库的主键列
    @GeneratedValue(strategy = GenerationType.IDENTITY) // 采用数据库ID自增长的方式来自增主键字段
    @Column(name = "id") // 声明该属性与数据库字段的映射关系。
    int id;

    String username;
    String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}