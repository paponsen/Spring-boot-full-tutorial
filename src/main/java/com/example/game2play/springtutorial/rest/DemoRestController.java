package com.example.game2play.springtutorial.rest;

import com.example.game2play.util.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    private Coach myCoach;

    @Autowired
    public DemoRestController( Coach coach){
        this.myCoach = coach;
    }

    @GetMapping("/dailyworkout")
    public String workout(){
        return myCoach.dailyWorkOut();
    }
}
