package com.howtodoinjava.app.controller;

import com.howtodoinjava.app.service.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    MyService myService;

    @GetMapping("/user")
    public String testOrder(){
        System.out.println(" test Order >>>>");
        myService.getUser();
        return "Order Return ";
    }

    @GetMapping("/order")
    public String testUser(){
        System.out.println(" test User>>>>>");
        myService.saveOrderDataInDB();
        return "User Return ";
    }
}
