package com.Controller;

import com.Bean.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class userController {
    @RequestMapping("/login")
    public String sto(){
        return "success";
    }


    /**
     * ResponseBody
     * @return
     */
    @RequestMapping("/cc")
    @ResponseBody
    public List<Student> search1(){
        List<Student> S1 = new ArrayList<>();
        Student s = new Student();
        Student ss = new Student();
        ss.setPwd("456");ss.setUsername("wcl");
        s.setPwd("123");s.setUsername("qjm");
        S1.add(s);S1.add(ss);
        return S1;
    }

    /**
     * @RequestBody
     * @param student
     * @param model
     * @return
     */
    @RequestMapping("/ww")
    public String search2(@RequestBody Student student,Model model){
        model.addAttribute("qjm",student);
        return "Rbody";
    }

    /**
     * @RequestParam
     * @param name
     * @param pwd
     * @param model
     * @return
     */
    @RequestMapping("/qq")
    public String search3(@RequestParam("nn")String name, @RequestParam("pp")String pwd, Model model){
        Student s = new Student();
        s.setUsername(name);
        s.setPwd(pwd);
        model.addAttribute("qjm",s);
        return "Rparam";
    }





}
