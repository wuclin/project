package com.example.hystrixcustomer1112.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Component
public class UserService {

    @Resource
    RestTemplate restTemplate;
    //服务中断
    @HystrixCommand(fallbackMethod = "errorFallBack")
    public String searchUser(){
        return restTemplate.getForObject("http://provider/searchName",String.class);
    }

    public String errorFallBack(){
        return "error";
    }
}
