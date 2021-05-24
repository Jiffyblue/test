package com.example.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName : TestController
 * @Description :
 * @Author : wjf
 * @Date: 2021-05-24 17:00
 */
@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }
}
