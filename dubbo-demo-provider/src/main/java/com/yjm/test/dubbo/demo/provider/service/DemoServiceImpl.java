package com.yjm.test.dubbo.demo.provider.service;

import com.yjm.test.dubbo.demo.api.DemoService;

/**
 * Created by yangjinming on 16/6/26.
 */
public class DemoServiceImpl implements DemoService {

    public String sayHello(String str){
        System.out.println("provider receive messages from client, content [" + str + "]");
        return "hello consumer, provider receive you content [" + str +"]";
    }
}
