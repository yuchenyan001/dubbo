package com.dubbo.consumer;

import com.dubbo.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.err.println("consumer start");
        DemoService demoService = context.getBean(DemoService.class);
        System.err.println("consumer");
        System.out.println(demoService.getPermissions(1L));
    }

}
