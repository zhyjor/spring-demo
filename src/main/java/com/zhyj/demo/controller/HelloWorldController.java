package com.zhyj.demo.controller;

import com.zhyj.demo.bean.User;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.Date;
import java.util.HashMap;
import java.util.Map;

//一种规范
@RestController
@RequestMapping(value = "/index")
public class HelloWorldController {
    @RequestMapping(value = "/")
    public String index() {
        return "Hello world";
    }

    @RequestMapping("/get1")
    public Map<String, String> get(@RequestParam String name) {
        Map<String, String> map = new HashMap<String, String>();
        map.put("name", name);
        map.put("value", "哈哈哈");
        return map;
    }

    @RequestMapping(value = "/find/{id}/{name}")
    public User get(@PathVariable int id, @PathVariable String name) {
        User user = new User();
        user.setId(id);
        user.setName(name);
        user.setData(new Date());
        return user;
    }
}
