package com.example;

import java.util.Date;

import com.alibaba.dubbo.config.annotation.Service;

@Service(version = "1.0.0")
public class HelloServiceImpl implements HelloService {

	@Override
    public String sayHello(String name) {
        System.out.printf("name:"+name);
        return "Hello, " + name + ", " + new Date();
    }

    @Override
    public String test2(String name) {
        System.out.printf("name:"+name);
        return "test2, " + name + ", " + new Date();
    }
}