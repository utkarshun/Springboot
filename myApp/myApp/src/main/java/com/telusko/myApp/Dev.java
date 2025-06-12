package com.telusko.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import static java.util.regex.Pattern.compile;
//import static jdk.internal.org.jline.utils.Log.debug;

@Component
@Qualifier("laptop")
public class Dev {
    @Autowired  //Field Injection
    private Computer comp;
//    public Dev(Laptop laptop){
//        this.laptop=laptop;  //constructor injection
//    }
//    @Autowired
//    public void setLaptop(Laptop laptop){
//        this.laptop=laptop;
//    }
    public void build(){
        comp.compile();
//        debug();
        System.out.println("Working on awesome project");
    }

}
