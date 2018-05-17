package com.springframework.demo.proxy.dynamic;

import com.springframework.demo.proxy.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by fuqinqin on 2018/5/14.
 */
public class PersonInvocationHandler implements InvocationHandler {

    Person target;

    public PersonInvocationHandler(Person person){
        this.target = person;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Long start = System.currentTimeMillis();
        Object result = method.invoke(target, args);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("耗时： "+(System.currentTimeMillis()-start)+" 毫秒");

        return result;
    }
}
