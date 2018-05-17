package com.springframework.demo.proxy;

/**
 * Created by fuqinqin on 2018/5/14.
 */
public class ZhangSan implements Person {

    @Override
    public void sayHello(String content) {
        System.out.println("hello, "+content);
    }
}
