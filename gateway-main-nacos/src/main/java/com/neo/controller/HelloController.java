package com.neo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
    @RequestMapping("/hello_gateway")
    public String index() {
        return "hello world,gateway!";
    }

    @RequestMapping("/foo_gateway")
    public String foo(String foo) {
        return "hello ,gateway"+foo+"!";
    }

}