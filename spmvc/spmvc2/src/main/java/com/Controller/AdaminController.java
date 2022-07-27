package com.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdaminController {

    @RequestMapping("/Admin")
    public String ge(){
        return "i1";
    }

}
