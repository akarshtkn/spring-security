package com.example.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthenticationController {

    @RequestMapping("/user")
    public String greetUser(){
        return "Hello user";
    }


    @RequestMapping("/admin")
    public String greetAdmin(){
        return "Hello admin";
    }
}
