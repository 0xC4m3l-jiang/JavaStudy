package com.jiang.log;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class logAfter implements AfterReturningAdvice {
    // returnvalue 返回值
    public void afterReturning(Object returnvalue, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("执行了"+method.getName()+"返回结果为"+returnvalue);

    }
}
