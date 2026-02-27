package com.in28minutes.learn.spring.framework;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learn.spring.framework.game.GameRunner;
import com.in28minutes.learn.spring.framework.game.GamingConsole;
import com.in28minutes.learn.spring.framework.game.SuperContraGame;
import com.in28minutes.learn.spring.framework.helloworld.HelloWorldConfiguration;

@SpringBootApplication
public class App03GamimgSpringBeans {

	public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);
		//var matioGame = new MarioGame();
		
		try(var context =new AnnotationConfigApplicationContext(GamingConfiguration.class))
      		{
			 context.getBean(GamingConsole.class).up();
			 context.getBean(GameRunner.class).run();
			}

	}
}
