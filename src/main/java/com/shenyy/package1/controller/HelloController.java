package com.shenyy.package1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

/**
 * Spring MVC中的控制器——HelloController*/
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello spring boot!";
    }
}
