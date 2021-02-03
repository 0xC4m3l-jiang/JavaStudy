package com.jiang.demo02;

import com.jiang.demo01.Proxy;

public class Client {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        // 创建对应的 proxy 并对应代理对象注入。
        UserServiceProxy proxy = new UserServiceProxy();
        proxy.setUserService(userService);

        proxy.add();
    }
}

