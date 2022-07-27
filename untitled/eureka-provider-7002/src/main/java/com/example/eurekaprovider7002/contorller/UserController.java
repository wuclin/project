package com.example.eurekaprovider7002.contorller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping("/searchName")
    public String searchName(){
        System.out.println("7002");
        return "namemm";
    }

    @RequestMapping("/searchNum/{num}")
    public String searchNum(@PathVariable("num")int num){
        System.out.println(num);
        return "timeout";
    }
}
