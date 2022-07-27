package com.kcsj.demo.service;

import com.kcsj.demo.entity.Cuser;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CuserService {
    List<Cuser> findAllInfo();
}
