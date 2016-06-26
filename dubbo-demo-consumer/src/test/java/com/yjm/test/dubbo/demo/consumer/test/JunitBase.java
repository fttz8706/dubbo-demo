package com.yjm.test.dubbo.demo.consumer.test;

import org.junit.Before;
import org.junit.BeforeClass;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by yangjinming on 16/6/26.
 */
public class JunitBase {

    protected static ApplicationContext context;

    @BeforeClass
    public static void setUp(){
        try{
            context = new ClassPathXmlApplicationContext(new String[] {"spring-config.xml"});
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Before
    public void autoSetBean(){
        context.getAutowireCapableBeanFactory().autowireBeanProperties(this, DefaultListableBeanFactory.AUTOWIRE_BY_NAME, false);
    }

}
