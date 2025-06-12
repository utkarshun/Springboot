package com.telusko.myApp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {

    @Autowired
    @Qualifier("laptop") // ✅ This tells Spring: use Laptop bean
    private Computer comp;

    public void build() {
        comp.compile();
        System.out.println("Working On Awesome Project");
    }
}
