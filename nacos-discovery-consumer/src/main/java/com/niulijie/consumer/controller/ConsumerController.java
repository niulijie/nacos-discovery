package com.niulijie.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
//@Controller
//@ResponseBody
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "{content}")
    public String hello(@PathVariable String content) {
        // url = http://服务提供者的应用名称/接口名称/参数
        System.out.println("1111");
        return restTemplate.getForObject("http://nacos-provider/hello/" + content, String.class);
    }
}
