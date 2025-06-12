package com.telusko.myApp1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyApp1Application {

	public static void main(String[] args) {
		ApplicationContext context= SpringApplication.run(MyApp1Application.class, args);
//		Dev obj=new Dev();
		Dev obj = context.getBean(Dev.class);
		obj.build();
	}

}
