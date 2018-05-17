package com.springframework.demo.proxy.dynamic;

import com.springframework.demo.proxy.Person;
import sun.misc.ProxyGenerator;

import java.io.FileOutputStream;

/**
 * Created by fuqinqin on 2018/5/14.
 */
public class PersistenceProxy {

    public static void persistence(){
        byte[] classFile = ProxyGenerator.generateProxyClass("$Proxy0", Person.class.getInterfaces());
        String path = "F://工作/2018/5/14/PersonProxy.class";
        try(FileOutputStream fos = new FileOutputStream(path)) {
            fos.write(classFile);
            fos.flush();
            System.out.println("代理类class文件写入成功");
        } catch (Exception e) {
            System.out.println("写文件错误");
        }
    }

}
