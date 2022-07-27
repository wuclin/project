package com.kcsj.demo.controell;

import com.kcsj.demo.entity.People;
import com.kcsj.demo.mapper.PeopleMapper;
import com.kcsj.demo.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PeopleController {

    @Autowired
    private PeopleService peopleService;

    @Autowired
    private PeopleMapper peopleMapper;

    @GetMapping("/name")
    public List<People> F(){
        return peopleMapper.findAll();
    }

    @ResponseBody
    @RequestMapping(value = "/findAll")
    public List<People> findAllinfo(){
        return peopleService.findAll();
    }

    @ResponseBody
    @RequestMapping(value = "/hi")
    public String TEST(){
        return "为啥不行呢";
    }


}
