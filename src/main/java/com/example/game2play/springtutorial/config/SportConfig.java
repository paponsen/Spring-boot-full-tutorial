package com.example.game2play.springtutorial.config;

import com.example.game2play.util.Coach;
import com.example.game2play.util.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach(){
        return  new SwimCoach();
    }
}
