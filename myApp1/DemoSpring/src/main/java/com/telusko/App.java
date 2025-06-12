package com.telusko;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Dev obj=(Dev) context.getBean("dev");
//        obj.build();
//        obj.setAge(18);
//        System.out.println(obj.getAge());
//        System.out.println(obj.getSalary());
        obj.build();
    }
}
