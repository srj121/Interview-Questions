package com.example.Spring_Security_JWT.controller;

import com.example.Spring_Security_JWT.entity.WatchMan;
import com.example.Spring_Security_JWT.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ControllerClass {

    @Autowired
    UserService userService;

    @GetMapping("/welcome")
    public String statement(){
        return "welcome to the page  ";
    }
    @GetMapping("/admin")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String adminStatement(){
        return "welcome to the page ADMIN";

    }
    @GetMapping("/error")
    @PreAuthorize("hasRole('ROLE_USER')")
    public String error(){
        return "The userName or password is Wrong ";
    }


    @PostMapping("/new")
    public String addNewUser(@RequestBody WatchMan watchMan){
    return userService.addUser(watchMan);
    }

}