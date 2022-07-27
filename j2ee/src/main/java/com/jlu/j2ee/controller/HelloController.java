package com.jlu.j2ee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class HelloController {

//    @ResponseBody
    @RequestMapping("/hi")
    public String hello(Map<String , Object> map){
        map.put("hello","Nihao");
        return "login";
    }

    @RequestMapping("/tt")
    public String test(Map<String , Object> map){
        map.put("hello","Nihao");
        return "login";
    }
}
