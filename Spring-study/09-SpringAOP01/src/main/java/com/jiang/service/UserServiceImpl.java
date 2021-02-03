package com.jiang.service;

public class UserServiceImpl implements UserService{
    public void add() {
        System.out.println("增加一个用户");
    }

    public void delete() {
        System.out.println("删除一个用户");
    }

    public void update() {
        System.out.println("跟新一个用户");
    }

    public void select() {
        System.out.println("查找一个用户");
    }
}
