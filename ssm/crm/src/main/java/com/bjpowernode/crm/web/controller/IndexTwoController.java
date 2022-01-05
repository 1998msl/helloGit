package com.bjpowernode.crm.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 2021/12/30
 */
@Controller
public class IndexTwoController {
    @RequestMapping("/.do")
    public String index(){
        return "index";
    }
}
