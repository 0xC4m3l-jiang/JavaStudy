package com.jiang.set;

import java.nio.channels.Pipe;

public class HelloWorld {
    @Override
    public String toString() {
        return "HelloWorld{" +
                "message='" + message + '\'' +
                '}';
    }

    public HelloWorld() {
        System.out.println("无参数构造");
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        System.out.println("调用 set 方法。");
        this.message = message;
    }

    private String message;
}
