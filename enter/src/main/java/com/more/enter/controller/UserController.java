package com.more.enter.controller;

import com.more.enter.gateway.FeignUserClient;
import com.more.friday.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

//https://www.cnblogs.com/wryu/p/7327298.html
@RestController
public class UserController {
    @Autowired
     private  FeignUserClient feignUserClient;
    @RequestMapping(value = "/person/fe")
    public String test1(){
      String ss=  feignUserClient.test1();
            return "11111;;;"+ss;

    }
    @RequestMapping(value = "/person/appfe")
    public String test2(){
        String ss=  feignUserClient.test2();
        return "22222;;;"+ss;

    }
    @RequestMapping(value = "/person/save",method = RequestMethod.GET)
    public String test3(@RequestParam String name){
        User ss=  feignUserClient.test3(name);
        return "33333;;;"+ss.getName().toString();

    }
    @RequestMapping(value = "/person/findbyid",method = RequestMethod.POST)
    public String test4(@RequestParam Integer id){
        String ss=  feignUserClient.test4(id);
        return "44444;;;"+ss;

    }
    @RequestMapping(value = "/ws/sendmsg",method = RequestMethod.GET)
    public String test5(@RequestParam String name){
        String ss=  feignUserClient.test5(name);
        return ss.toString();

    }

    @RequestMapping("/ws/tootherhtml")
    public String test6(@RequestParam("id") String id){
        String ss=  feignUserClient.test6(id);
        return ss.toString();
    }

    @RequestMapping("/ws/tosecondhtml")
    public String test7(){
        String ss=  feignUserClient.test7();
        return ss.toString();
    }
}
