package com.example.eurekaprovider2client.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @RequestMapping("/hi")
    public String hello(){
        System.out.println("host:"+"1111");
        return "hello";
    }
}
