package com.xxoo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AController {

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "成功！！！！！！！！！！！！";
    }
}
