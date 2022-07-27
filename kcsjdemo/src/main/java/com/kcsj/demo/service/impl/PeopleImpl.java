package com.kcsj.demo.service.impl;

import com.kcsj.demo.entity.People;
import com.kcsj.demo.mapper.PeopleMapper;
import com.kcsj.demo.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "PeopleService")
public class PeopleImpl implements PeopleService {

    @Autowired(required = false)
    private PeopleMapper peopleMapper;


    @Override
    public List<People> findAll() {
        return peopleMapper.findAll();
    }
}
