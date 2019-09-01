package com.imooc.xunwuproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 */
@Controller
public class HomeController {


    @GetMapping(name = "/")
    public String index(Model model){
        model.addAttribute("name","慕课时间");
        return "index";
    }


}
