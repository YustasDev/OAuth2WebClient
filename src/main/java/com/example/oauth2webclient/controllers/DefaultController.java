package com.example.oauth2webclient.controllers;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @GetMapping("/")
    public String getHello(){
        return "Hello World";
    }

    @GetMapping("/secured")
    public String secured() {
        return "Hello, Secured!";
    }


    @GetMapping("/success_enter")
    public String enter() {
        return "Entry completed!";
    }


}
