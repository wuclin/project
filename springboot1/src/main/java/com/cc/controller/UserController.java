package com.cc.controller;

import com.cc.domain.User;
import com.cc.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    private static final Logger logger =  LoggerFactory.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping("/test")
    public List<User> SelectUser(){
        logger.info("测试查找");
        return userService.SelectUser();
    }

    @ResponseBody
    @RequestMapping("/add")
    public String addUser(){
        User user = new User();
        user.setPwd("123");
        user.setUsername("qjm");
        userService.addUser(user);
        logger.info(user.getUsername()+user.getPwd());
        return "success";
    }
}
