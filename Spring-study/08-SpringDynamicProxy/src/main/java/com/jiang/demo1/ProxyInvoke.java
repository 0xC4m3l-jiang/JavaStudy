package com.jiang.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;


// 自动生成代理对象
public class ProxyInvoke implements InvocationHandler {

    // 被代理的接口
    private Rent rent;
    public void setRent(Rent rent) {
        this.rent = rent;
    }

    // 生成代理类
    public Object getProxy(){
//        loader：    一个classloader对象，
//                    定义了由哪个classloader对象对生成的代理类进行加载
//        interfaces：一个interface对象数组，
//                    表示我们将要给我们的代理对象提供一组什么样的接口，
//                    如果我们提供了这样一个接口对象数组，那么也就是声明了代理类实现了这些接口，
//                    代理类就可以调用接口中声明的所有方法。
//        h：         一个InvocationHandler对象，
//                    表示的是当动态代理对象调用方法的时候会关联到哪一个InvocationHandler对象上，并最终由其调用。

        return Proxy.newProxyInstance(this.getClass().getClassLoader(),rent.getClass().getInterfaces(),this);
    }
    // 处理代理 返回结构
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // 反射实现动态代理。
        seehouse();
        fare();
        return method.invoke(rent,args);
    }

    public void seehouse(){
        System.out.println("看房子");
    }
    public void fare(){
        System.out.println("收中介费");
    }
}
