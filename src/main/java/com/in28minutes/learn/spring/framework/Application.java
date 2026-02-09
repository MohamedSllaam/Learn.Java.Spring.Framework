package com.in28minutes.learn.spring.framework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);
		var matioGame = new MarioGame();
		var gameRunner = new GameRunner(matioGame);
		gameRunner.run();
	}

}
