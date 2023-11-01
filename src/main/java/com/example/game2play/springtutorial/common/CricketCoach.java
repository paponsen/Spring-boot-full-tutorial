package com.example.game2play.springtutorial.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{
    @Override
    public String dailyWorkOut() {
        return "Practice batting for 1 hour and bowling for 1 hour";
    }
}
