package com.kcsj.demo.service.impl;

import com.kcsj.demo.entity.Cuser;
import com.kcsj.demo.mapper.CuserMapper;
import com.kcsj.demo.service.CuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service(value = "CuserService")
public class CuserImpl implements CuserService {

    @Autowired
    private CuserMapper cuserMapper;


    @Override
    public List<Cuser> findAllInfo() {
        return cuserMapper.selectAllInfo();
    }
}
