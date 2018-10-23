package friday.controller;

import friday.websocket.WebSocketServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

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
            model.addAttribute("myid",id);
            return "redirect:otherpage";
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
