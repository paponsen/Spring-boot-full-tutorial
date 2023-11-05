package com.example.game2play.springtutorial.rest;

import com.example.game2play.util.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController {

    private Coach myCoach;
    private Coach anotherCoach;

    private Coach newCoach;

    @Autowired
    public DemoRestController(@Qualifier("cricketCoach") Coach coach, @Qualifier("cricketCoach") Coach anotherCoach,
                              @Qualifier("swimCoach") Coach newCoach){
        this.myCoach = coach;
        this.anotherCoach = anotherCoach;
        this.newCoach = newCoach;
    }

    @GetMapping("/dailyworkout")
    public String workout(){
        return myCoach.dailyWorkOut();
    }

    @GetMapping("/check")
    public String check(){
        return "Comparing bean myCoach == anotherCoach: "+ (myCoach == anotherCoach);
    }

    @GetMapping("/config")
    public String config(){
        return newCoach.dailyWorkOut();
    }
}
