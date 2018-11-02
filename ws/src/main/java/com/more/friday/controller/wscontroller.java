package com.more.friday.controller;


import com.more.friday.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class wscontroller {
    Logger logger =  LoggerFactory.getLogger(this.getClass());
    @RequestMapping(value = "/sendmsg",method = RequestMethod.GET)
    public String webSocket(@RequestParam String name,Model model){

        try{
            logger.info("跳转到websocket的页面上");
            model.addAttribute("username",name);
           // return "websocket";
            return "websocket";
        }
        catch (Exception e){
            logger.info("跳转到websocket的页面上发生异常，异常信息是："+e.getMessage());
            return "error";
        }
    }

    @RequestMapping(value = "/tootherhtml",method = RequestMethod.GET)
    public String toOtherHtml(@RequestParam String id,Model model){
        try{
            logger.info("otherHtml;;"+id);
            User user1=new User();
            user1.setId("1");
            user1.setName( "张三" );
            user1.setAge( 20 );

            User user2=new User();
            user2.setId("2");
            user2.setName( "王五" );
            user2.setAge( 22 );
            List<User> list=new ArrayList<User>(  );
            list.add( user1 );
            list.add( user2 );
            model.addAttribute( "list",list );
            model.addAttribute("myid",id);
            return "otherpage";
        }
        catch (Exception e){
            logger.info("跳转到otherHtml的页面上发生异常，异常信息是："+e.getMessage());
            return "error";
        }
    }

    @RequestMapping(value = "/tosecondhtml",method = RequestMethod.GET)
    public String tosecondhtml(){
        try{
            logger.info("tosecondhtml;;");
            return "otherpage";
        }
        catch (Exception e){
            logger.info("跳转到otherHtml的页面上发生异常，异常信息是："+e.getMessage());
            return "error";
        }
    }

}
