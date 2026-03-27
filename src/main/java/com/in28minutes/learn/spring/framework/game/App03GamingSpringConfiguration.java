package com.in28minutes.learn.spring.framework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class App03GamingSpringConfiguration {
  
//	@Bean
//	public GamingConsole game() {
//		 var game= new PacmanGame();
//		 return game;
//	}
	
	@Bean
	public GameRunner gameRunner(@Qualifier("SuperContraGameQualifier") GamingConsole game) {
		 System.out.println("Paramter: "+game);
		 var gameRunner= new GameRunner(game);
		 return gameRunner;
	}
	
}
