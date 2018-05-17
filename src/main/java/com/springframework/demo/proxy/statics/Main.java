package com.springframework.demo.proxy.statics;

import com.springframework.demo.proxy.ZhangSan;

/**
 * Created by fuqinqin on 2018/5/14.
 */
public class Main {
    
    public static void main(String[] args){
        ZhangSan zhangSan = new ZhangSan();
        ProxyBean proxyBean = new ProxyBean(zhangSan);
        proxyBean.sayHello("ZhangSan");
    }
    
}
