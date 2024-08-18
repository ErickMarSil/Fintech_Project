package com.fintech.project.demo.endpoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginBP {
    @GetMapping("/login")
    public String loginBP(){
        return "Login";
    }
}
