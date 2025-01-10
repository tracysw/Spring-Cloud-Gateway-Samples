package com.neo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	@GetMapping("/hello")
    public String index() {
        return "hello world!";
    }
	
    @GetMapping("/user/hello")
    public String indexUser() {
        return "hello world user!";
    }

    @RequestMapping("/user/foo")
    public String foo(String foo) {
        return "hello "+foo+"!";
    }

}