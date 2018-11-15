package com.more.enter.controller;

import com.more.enter.gateway.CommunityClient;
import com.more.friday.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

//https://www.cnblogs.com/wryu/p/7327298.html
@RestController
public class UserController {
    @Autowired
     private  CommunityClient communityClient;
    @RequestMapping(value = "/person/fe")
    public @ResponseBody String test1(){
      String ss=  communityClient.test1();
            return "11111;;;"+ss;

    }
    @RequestMapping(value = "/person/appfe")
    public @ResponseBody String test2(){
        String ss=  communityClient.test2();
        return "22222;;;"+ss;

    }
    @RequestMapping(value = "/person/save",method = RequestMethod.GET)
    public @ResponseBody String test3(@RequestParam String name){
        User ss=  communityClient.test3(name);
        return "33333;;;"+ss.getName().toString();

    }
    @RequestMapping(value = "/person/findbyid",method = RequestMethod.POST)
    public @ResponseBody String test4(@RequestParam Integer id){
        String ss=  communityClient.test4(id);
        return "44444;;;"+ss;

    }
    @RequestMapping(value = "/ws/sendmsg",method = RequestMethod.GET)
    public @ResponseBody String test5(@RequestParam String name){
        String ss=  communityClient.test5(name);
        return ss.toString();

    }

    @RequestMapping("/ws/tootherhtml")
    public @ResponseBody String test6(@RequestParam("id") String id){
        String ss=  communityClient.test6(id);
        return ss.toString();
    }

    @RequestMapping(value = "/ws/tosecondhtml",method = RequestMethod.GET)
    public @ResponseBody String test7(){
        String ss=  communityClient.test7();
        return ss.toString();
    }
}
