package com.example.game2play.util;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CricketCoach implements Coach{

    public CricketCoach(){
        System.out.println("In constructor:"+getClass().getSimpleName());
    }
    @Override
    public String dailyWorkOut() {
        return "Practice batting for 1 hour and bowling for 1 hour";
    }
}
