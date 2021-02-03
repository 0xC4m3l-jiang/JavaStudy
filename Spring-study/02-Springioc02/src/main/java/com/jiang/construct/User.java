package com.jiang.construct;

import javax.xml.transform.Source;

public class User {
    private String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public User(String name) {
        System.out.println("调用参数构造方法。利用 xml 中的 constructor-arg");
        this.name = name;
    }
}

