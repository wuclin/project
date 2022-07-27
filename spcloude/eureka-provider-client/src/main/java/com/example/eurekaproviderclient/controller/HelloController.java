package com.example.eurekaproviderclient.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {

    @RequestMapping("/hi")
    public String hello(){
        System.out.println("host:"+"7001");

        return "hello";
    }
}
