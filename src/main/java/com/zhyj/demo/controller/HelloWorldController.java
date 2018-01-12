package com.zhyj.demo.controller;

import com.zhyj.demo.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/getUser")
    public User getUser() {
        User user = new User();
        user.setUserName("小明");
        user.setPassWord("xxxx");
        return user;
    }
}
