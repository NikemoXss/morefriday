package com.more.friday.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//https://www.cnblogs.com/wryu/p/7327298.html
@RestController
public class UserController {

    @RequestMapping(value = "/api/test")
    public String test1(){
            return "123466";
    }

}
