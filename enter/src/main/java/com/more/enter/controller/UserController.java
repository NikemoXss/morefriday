package com.more.enter.controller;

import com.more.enter.gateway.FeignUserClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class UserController {
    @Autowired
    private FeignUserClient feignUserClient;
    @RequestMapping(value = "/person/fe")
    public String test1(){
      String ss=  feignUserClient.test1();
            return "333334445553;;;"+ss;

    }
}
