package com.xiaobai.api.service.impl;

import com.xiaobai.api.service.IHelloService;

public class HelloServiceImpl implements IHelloService {
    @Override
    public String sayHello(String name) {
        return name;
    }
}
