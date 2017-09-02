package com.daibo.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by daibo on 2017/9/2.
 */
@Controller
public class Index_C {

    @RequestMapping(value = "index")
    public String indexIn(){
        return "index";
    }

    @RequestMapping(value = "hello")
    public String hello(Model model){
        System.out.println("_________________");
        model.addAttribute("hello","世界");
        return "hello";
    }
}
