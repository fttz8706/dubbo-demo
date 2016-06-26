package com.yjm.test.dubbo.demo.consumer.test;

import com.alibaba.dubbo.rpc.filter.ExecuteLimitFilter;
import com.yjm.test.dubbo.demo.api.DemoService;
import com.yjm.test.dubbo.demo.consumer.Consumer;
import org.junit.Test;

/**
 * Created by yangjinming on 16/6/26.
 */
public class consumerTest extends JunitBase {

    private DemoService demoService;

    @Test
    public void consumerTest(){
        try{
            demoService = (DemoService)context.getBean("demoService");
            Consumer consumer = new Consumer(demoService);
            consumer.consumer();
            System.in.read();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
