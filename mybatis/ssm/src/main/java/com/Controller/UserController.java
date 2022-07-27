package com.Controller;

import com.Service.UserService;
import com.Bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/Select")
    @ResponseBody
    public List<User> selectUser(){
        List<User> users = userService.selectUser();
        return users;
    }
}
