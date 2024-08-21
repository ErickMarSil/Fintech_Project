package com.fintech.project.demo.endpoints;

import com.fasterxml.jackson.databind.JsonNode;
import com.fintech.project.demo.controll.UserControll;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginBP {
    @PostMapping("/login")
    public boolean loginBP(@RequestBody JsonNode Json){
        // Return the login action result by blueprint
        UserControll loginAction = new UserControll(Json);
        return loginAction.LoginAction();
    }
}
