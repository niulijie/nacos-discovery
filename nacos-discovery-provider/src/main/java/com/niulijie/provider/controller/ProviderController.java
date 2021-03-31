package com.niulijie.provider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
//@Controller
//@ResponseBody
public class ProviderController {
    @RequestMapping("hello/{content}")
    public String hello(@PathVariable("content") String content) {
        return "hello, " + content;
    }
}
