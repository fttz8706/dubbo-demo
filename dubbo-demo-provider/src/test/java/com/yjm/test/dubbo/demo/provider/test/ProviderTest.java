package com.yjm.test.dubbo.demo.provider.test;

import com.yjm.test.dubbo.demo.api.DemoService;
import org.junit.Test;

/**
 * Created by yangjinming on 16/6/26.
 */
public class ProviderTest extends JunitBase {

    private DemoService demoService;

    @Test
    public void providerTest(){
        try {
            demoService = (DemoService) context.getBean("demoService");
            System.out.println("press any key to continue...");
            System.in.read();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
