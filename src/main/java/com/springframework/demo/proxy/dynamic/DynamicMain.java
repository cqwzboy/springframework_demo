package com.springframework.demo.proxy.dynamic;

import com.springframework.demo.proxy.Person;
import com.springframework.demo.proxy.ZhangSan;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by fuqinqin on 2018/5/14.
 */
public class DynamicMain {

    public static void main(String[] args){

        ZhangSan zhangSan = new ZhangSan();

        // 1. 创建调用处理器
        InvocationHandler invocationHandler = new PersonInvocationHandler(zhangSan);

        // 2. 创建动态代理类
        Person proxy = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), new Class<?>[]{Person.class}, invocationHandler);

        // 3. 调用
        proxy.sayHello("zhangsan proxy");

        System.out.println(proxy.getClass());

        // 4. 持久化动态代理类
        PersistenceProxy.persistence();

    }


}
