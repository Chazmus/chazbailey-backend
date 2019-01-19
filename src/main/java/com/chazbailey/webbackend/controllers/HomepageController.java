package com.chazbailey.webbackend.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomepageController {

    @RequestMapping("/")
    public String homepage(){
        return "Welcome to the homepage";
    }
}
