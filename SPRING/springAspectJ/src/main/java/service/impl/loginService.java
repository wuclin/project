package service.impl;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("ss")
public class loginService {

    public void login(){
        System.out.println("login....");
    }
}
