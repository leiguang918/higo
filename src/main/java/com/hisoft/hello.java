package com.hisoft;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class hello {
    @RequestMapping("/hello")
    public String run(){
        System.out.println("jj");
        System.out.println("ll");
        System.out.println("oo");
        System.out.println("come in");
        System.out.println("leiyu分支");
        System.out.println("master分支");
        System.out.println("master2");
        System.out.println("ppo");
        return "hello";
    }
}
