package com.sun.controller;

import com.sun.service.HelloTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class HelloWorld {

    @Resource
    private HelloTest helloTest;
    @RequestMapping("/hello")
    public String hello(){
        helloTest.hello();
        return "hello";
    }
}
