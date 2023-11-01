package com.example.game2play.springtutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.game2play.springtutorial",
		"com.example.game2play.util"})
public class SpringtutorialApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringtutorialApplication.class, args);
	}

}
