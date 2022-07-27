package com.example.feignconsumer2222.controller;

import com.example.feignconsumer2222.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping("/get")
    public String searchUser(){
        return userService.searchUser();
    }
}
