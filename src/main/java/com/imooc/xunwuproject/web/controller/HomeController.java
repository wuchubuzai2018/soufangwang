package com.imooc.xunwuproject.web.controller;

import com.imooc.xunwuproject.base.ApiResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 */
@Controller
public class HomeController {


    @GetMapping("/")
    public String index(Model model){
        model.addAttribute("name","慕课时间");
        return "index";
    }

    @GetMapping("/get")
    @ResponseBody
    public ApiResponse get(){
        return ApiResponse.ofMessage(200,"成功了");
    }


}
