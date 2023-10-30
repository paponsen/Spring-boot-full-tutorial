package com.example.game2play.springtutorial.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    @Value("${game2play.ceo.name}")
    private String name;
    @GetMapping("/")
    public String sayHello(){
        return "Welcome to Spring Tutorial";
    }

    @GetMapping("/desc")
    public String sayDescription(){
        return "Description: This is full package tutorial of Spring boot. Name:"+name;
    }

    @GetMapping("/daily")
    public String dailyMessage(){
        return  "Do programming daily";
    }

}
