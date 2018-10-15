package com.more.app.controller.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(value = "/person/findnum")
    public String test1(){
        return "lalalal;;;";
    }
}
