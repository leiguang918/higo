package com.hisoft;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class hello {
    @RequestMapping("/hello")
    public String run(){
        System.out.println("jj");
        System.out.println("ll");
        System.out.println("come in");
        return "hello";
    }
}
