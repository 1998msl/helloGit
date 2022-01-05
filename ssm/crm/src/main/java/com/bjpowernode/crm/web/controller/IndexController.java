package com.bjpowernode.crm.web.controller;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import sun.net.www.http.HttpClient;

import javax.servlet.http.HttpServletRequest;
import java.net.URI;

/**
 * 2021/12/29
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    public String toIndex(HttpServletRequest httpServletRequest){
        StringBuffer requestURL = httpServletRequest.getRequestURL();
        System.out.println(requestURL.toString());
        return "index";
    }
}
