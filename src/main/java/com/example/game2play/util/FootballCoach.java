package com.example.game2play.util;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{

    public FootballCoach(){
        System.out.println("In constructor:"+getClass().getSimpleName());
    }
    @Override
    public String dailyWorkOut() {
        return "Practice football regular for 1 hour";
    }
}
