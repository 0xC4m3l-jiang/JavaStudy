package com.jiang.demo02;

import java.sql.SQLOutput;

public class UserServiceImpl implements UserService{
    public void delete() {
        System.out.println("删除一个用户");
    }

    public void add() {
        System.out.println("增加一个用户");
    }

    public void update() {
        System.out.println("跟新一个用户");
    }

    public void query() {
        System.out.println("查询一个用户");
    }
}
