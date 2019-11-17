package com.dubbo.demo.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class Provider {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");
        System.err.println(context.getDisplayName() + ": here");
        context.start();
        System.err.println("服务已经启动...");
        System.in.read();
    }

}
