package com.springframework.demo.proxy.statics;

import com.springframework.demo.proxy.Person;
import com.springframework.demo.proxy.ZhangSan;

/**
 * Created by fuqinqin on 2018/5/14.
 */
public class ProxyBean implements Person {

    private ZhangSan zhangSan;

    public ProxyBean(ZhangSan zhangSan){
        this.zhangSan = zhangSan;
    }

    @Override
    public void sayHello(String content) {
        Long start = System.currentTimeMillis();
        zhangSan.sayHello(content);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("耗时： "+(System.currentTimeMillis()-start)+" 毫秒");
    }
}
