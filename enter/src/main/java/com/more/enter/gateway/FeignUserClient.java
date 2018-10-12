package com.more.enter.gateway;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "api-gateway", url = "${gateway.url}")
public interface FeignUserClient {
    @RequestMapping(value = "/web/person/findbyids",method = RequestMethod.GET)
    String test1();
}
