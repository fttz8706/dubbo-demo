package com.yjm.test.dubbo.demo.consumer;

import com.yjm.test.dubbo.demo.api.DemoService;

import javax.annotation.Resource;

/**
 * Created by yangjinming on 16/6/26.
 */
public class Consumer {

    private DemoService demoService;

    public Consumer(DemoService demoService){
        this.demoService = demoService;
    }

    public void consumer(){
        String msg = "consumer-001";
        String result = demoService.sayHello(msg);
        System.out.println(result);
    }

}
