package com.example.game2play.util;

public class SwimCoach implements Coach{
    public SwimCoach(){
        System.out.println("In constructor:"+getClass().getSimpleName());
    }
    @Override
    public String dailyWorkOut() {
        return "Swim regular for 1 hour";
    }
}
