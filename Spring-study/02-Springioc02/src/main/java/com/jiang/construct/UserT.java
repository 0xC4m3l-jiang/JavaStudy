package com.jiang.construct;

public class UserT {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }

    public UserT() {
        System.out.println("UserT创建");
    }
}
