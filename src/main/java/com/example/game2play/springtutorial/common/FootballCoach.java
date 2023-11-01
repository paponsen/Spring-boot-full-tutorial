package com.example.game2play.springtutorial.common;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach{
    @Override
    public String dailyWorkOut() {
        return "Practice football regular for 1 hour";
    }
}
