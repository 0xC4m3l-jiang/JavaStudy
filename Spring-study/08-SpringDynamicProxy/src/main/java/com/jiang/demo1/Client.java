package com.jiang.demo1;

public class Client {
    public static void main(String[] args) {
        // 实际对象
        Host host = new Host();

        // 代理对象
        ProxyInvoke invoke = new ProxyInvoke();
        // 设置要代理的对象
        invoke.setRent(host);
        // 返回代理类。 proxy 是动态生成的 没有写。
        Rent proxy =(Rent) invoke.getProxy();
        proxy.rent();
    }
}
