package com.jiang.diy;

public class DitPointcut {
    public void before(){
        System.out.println("===== 方法执行前 ====");
    }
    public void after(){
        System.out.println("===== 方法执行后 ====");
    }
}
