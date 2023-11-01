package com.example.game2play.util;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class FootballCoach implements Coach{
    @Override
    public String dailyWorkOut() {
        return "Practice football regular for 1 hour";
    }
}
