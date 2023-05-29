package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestControllet {
    @GetMapping("/")
    public String sayHello() {
        return "Hello World2";
    }

    @GetMapping("/user")
    public String printUser(){
        String user = "bongo";
        return "Hello " + user;
    }
}
