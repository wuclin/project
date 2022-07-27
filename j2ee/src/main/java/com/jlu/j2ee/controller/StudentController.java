package com.jlu.j2ee.controller;

import com.jlu.j2ee.service.StudentService;
import com.jlu.j2ee.domain.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("/Student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password,
                        Map<String, Object> map, HttpSession session){
        Student s = studentService.checkoutUsername(username);
        Student student = studentService.getUserByUsernameAndPwd(username,password);
        if (student != null){
            session.setAttribute("loginUser",username);
            return "redirect:/main.html";
        }
        else{
            map.put("msg","用户名或密码错误");
            return "login";
        }
    }

    @GetMapping("/exit")
    public String exit(HttpSession session){
        session.removeAttribute("loginUser");
        return "redirect:/index.html";
    }

}
