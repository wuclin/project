package com.jlu.j2ee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class SucessController {

    @RequestMapping("/ss")
    public String tosucc(Map<String , Object> map){
        map.put("hello","你好");
        return "seccess";
    }
}
