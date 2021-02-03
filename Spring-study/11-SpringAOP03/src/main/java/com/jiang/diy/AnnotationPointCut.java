package com.jiang.diy;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

// 利用注解
// 这个是一个 切面类
@Aspect
public class AnnotationPointCut {
    @Before("execution(* com.jiang.service.UserService.*(..))")
    public void before(){
        System.out.println("===== 方法执行前 ======");
    }
    @After("execution(* com.jiang.service.UserService.*(..))")
    public void after(){
        System.out.println("===== 方法执行后 ======");
    }

    @Around("execution(* com.jiang.service.UserService.*(..))")
    public void around(ProceedingJoinPoint jp) throws Throwable {
        System.out.println("环绕前");
        Object proceed = jp.proceed();
        System.out.println("环绕后");
    }
}
