package com.kcsj.demo.service;

import com.kcsj.demo.entity.People;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PeopleService {

    List<People> findAll();
}
