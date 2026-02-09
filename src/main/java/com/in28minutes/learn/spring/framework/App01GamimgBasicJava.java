package com.in28minutes.learn.spring.framework;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.in28minutes.learn.spring.framework.game.GameRunner;
import com.in28minutes.learn.spring.framework.game.SuperContraGame;

@SpringBootApplication
public class App01GamimgBasicJava {

	public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);
		//var matioGame = new MarioGame();
		var superContraGame = new SuperContraGame();
		var gameRunner = new GameRunner(superContraGame);
		gameRunner.run();
	}

}
