package com.more.enter.gateway;

import com.more.friday.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@FeignClient(value = "api-gateway", url = "${gateway.url}")
public interface FeignUserClient {
    @RequestMapping(value = "/web/person/findbyids",method = RequestMethod.GET)
    String test1();
    @RequestMapping(value = "/app/person/findnum",method = RequestMethod.GET)
    String test2();
    @RequestMapping(value = "/web/person/save",method = RequestMethod.POST)
    User test3(@RequestParam("name") String name);
    @RequestMapping(value = "/web/person/findbyid",method = RequestMethod.POST)
    String test4(@RequestParam("id") Integer id);
    @RequestMapping(value = "/ws/sendmsg",method = RequestMethod.GET)
    String test5(@RequestParam("name") String name);
    @RequestMapping(value = "/ws/tootherhtml",method = RequestMethod.GET)
    String test6(@RequestParam("id") String id);

    @RequestMapping(value = "/ws/tosecondhtml",method = RequestMethod.GET)
    String test7();
}
