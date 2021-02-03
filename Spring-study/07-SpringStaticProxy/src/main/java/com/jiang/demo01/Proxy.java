package com.jiang.demo01;

import java.io.PushbackInputStream;
import java.lang.ref.PhantomReference;
import java.security.PublicKey;

public class Proxy implements Rent{
    private Host host;
    public Proxy(){

    }

    public Proxy(Host host) {
        this.host = host;
    }

    private void seehouse(){
        System.out.println("看房子");
    }

    private void fare(){
        System.out.println("收中介费");
    }

    public void rent(){
        seehouse();
        fare();
        host.rent();
    }
}
