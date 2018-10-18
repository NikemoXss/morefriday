package friday.controller;

import friday.websocket.WebSocketServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@Controller
public class wscontroller {

    @RequestMapping(value = "/sendmsg",method = RequestMethod.GET)
    public String webSocket(@RequestParam String name,Model model){
         Logger logger =  LoggerFactory.getLogger(this.getClass());
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

}
