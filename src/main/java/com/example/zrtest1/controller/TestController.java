package com.example.zrtest1.controller;

import jdk.jfr.Registered;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.processing.Generated;
@RestController
public class TestController {
    @GetMapping("/test")
    public  String test(){
        return "Hello Jenkins!2";
    }
}



