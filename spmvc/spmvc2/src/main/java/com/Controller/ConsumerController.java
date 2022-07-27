package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConsumerController {
    @RequestMapping("/Consumer")
    public String Cs(){
        return "i2";
    }
}
