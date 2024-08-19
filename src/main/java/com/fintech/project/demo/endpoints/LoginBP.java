package com.fintech.project.demo.endpoints;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fintech.project.demo.services.UserActions.Login_Action;

@RestController
public class LoginBP {
    @PostMapping("/login")
    public boolean loginBP(){
        // Return the login action result by blueprint
        Login_Action loginAction = new Login_Action();
        return loginAction.login();
    }
}
