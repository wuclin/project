package com.example.feignconsumer2222.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient("provider")
public interface UserService {

    @RequestMapping("/searchName")
    String searchUser();
}
