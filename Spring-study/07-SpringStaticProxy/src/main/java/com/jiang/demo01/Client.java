package com.jiang.demo01;

public class Client {
    public static void main(String[] args) {
        // 够着 Host 给代理 Proxy
        Host host = new Host();
        Proxy proxy = new Proxy(host);
        // 调用 rent 是这里可以实现 proxy 的更进一步的代码。
        // 中介会 有新的操作
        proxy.rent();

    }
}
