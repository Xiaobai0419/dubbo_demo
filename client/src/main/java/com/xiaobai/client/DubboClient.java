package com.xiaobai.client;

import com.xiaobai.api.service.IHelloService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DubboClient {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        IHelloService helloService = (IHelloService) context.getBean("helloService");//获取远程服务代理
        String hello = helloService.sayHello("hello world");
        System.out.println(hello);
    }
}
