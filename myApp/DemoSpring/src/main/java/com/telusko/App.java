package com.telusko;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        Dev obj=(Dev) context.getBean("dev");
//        Dev obj=(Dev) context.getBean("dev1");
        obj.build();
//        obj.setAge(18);
//        System.out.println(obj.getAge());
//        System.out.println(obj.getSalary());
//
    }
}
