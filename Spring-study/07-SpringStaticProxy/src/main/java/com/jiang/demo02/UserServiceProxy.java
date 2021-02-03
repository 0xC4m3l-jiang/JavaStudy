package com.jiang.demo02;

import javax.sound.midi.Soundbank;

public class UserServiceProxy implements UserService {
    private UserServiceImpl userService;
    // 通常利用 set 方法来赋值
    public void setUserService(UserServiceImpl userService) {
        this.userService = userService;
    }

    public void delete() {
        log("delete");
        userService.delete();
    }

    public void add() {
        log("add");
        userService.add();
    }

    public void update() {
        log("update");
        userService.update();
    }

    public void query() {
        log("query");
        userService.query();
    }

    public void log(String function){
        System.out.println("使用了"+function+"方法");
    }
}
