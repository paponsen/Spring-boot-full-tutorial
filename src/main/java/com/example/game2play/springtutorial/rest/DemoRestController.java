package com.example.game2play.springtutorial.rest;

import com.example.game2play.springtutorial.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    private Coach myCoach;

    @Autowired
    public DemoRestController(@Qualifier("cricketCoach") Coach coach){
        this.myCoach = coach;
    }

    @GetMapping("/dailyworkout")
    public String workout(){
        return myCoach.dailyWorkOut();
    }
}
