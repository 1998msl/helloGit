package com.bjpowernode.crm.sessting.controller;

import com.alibaba.fastjson.JSONObject;
import com.bjpowernode.crm.sessting.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * 2021/12/29
 */
@Controller
public class LogIndexController {
    @RequestMapping("/sessting/toLogin.do")
    public String toLogin(HttpServletRequest httpServletRequest) {
        StringBuffer requestURL = httpServletRequest.getRequestURL();
        System.out.println(requestURL.toString());
        return "index";
    }

    @RequestMapping("/select/user.do")
    /*返回json数据*/
    @ResponseBody
    public Object selectUser() {
        Map map = new HashMap();
        User user=new User();
        user.setId("msl");
        user.setEmail("1476334926@qq.com");
        map.put("id", user.getId());
        map.put("email", user.getEmail());
        return map;
    }
}
