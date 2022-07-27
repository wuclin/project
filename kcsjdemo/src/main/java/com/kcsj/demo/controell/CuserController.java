package com.kcsj.demo.controell;

import com.kcsj.demo.entity.Cuser;
import com.kcsj.demo.mapper.CuserMapper;
import com.kcsj.demo.service.CuserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CuserController {

    @Autowired
    private CuserService cuserService;

    @Autowired
    private CuserMapper cuserMapper;

    @GetMapping("/cuser")
    public List<Cuser> G(){
        return cuserMapper.selectAllInfo();
    }
}
