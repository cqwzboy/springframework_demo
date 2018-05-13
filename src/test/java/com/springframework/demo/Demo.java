package com.springframework.demo;

import com.springframework.demo.controller.HelloController;
import org.junit.Test;
import org.springframework.util.ClassUtils;

/**
 * Created by fuqinqin on 2018/5/11.
 */
public class Demo {

    @Test
    public void test(){
        System.out.println(ClassUtils.hasMethod(HelloController.class,
                "sayHello", new Class[]{}));

        // 2.
        String url = "http://www.baidu.com/index.html";
        String pattern = "*.html";
        System.out.println(pattern.substring(1));
        System.out.println(url.indexOf(pattern.substring(1)));
        System.out.println(url.length());
        System.out.println(pattern.length());
        System.out.println(url.indexOf(pattern.substring(1)) == url.length() - pattern.length());
    }

}
