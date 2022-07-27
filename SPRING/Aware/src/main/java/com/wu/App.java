package com.wu;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        applicationContext.getBean("beanNameTest");
       Person xx =  (Person) applicationContext.getBean("xx");
        System.out.println(xx.toString());
    }
}
