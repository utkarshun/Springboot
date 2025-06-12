package com.telusko.simpleWebApp.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class HomeController {
    @RequestMapping("/")
//    @ResponseBody
    public String greet(){
        return "Welcome to Telusko!!!";
    }
    @RequestMapping("/about")
    public String about(){
        return "We don't teach,We educate!!!";
    }
}
