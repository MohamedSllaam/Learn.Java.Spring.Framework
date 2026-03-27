package com.in28minutes.learn.spring.framework.game;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration; 



@SpringBootApplication
public class GamingAppLauncherApplication {

	public static void main(String[] args) {
//		SpringApplication.run(Application.class, args);
		//var matioGame = new MarioGame();
		
		try(var context =new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class))
      		{
			
			 context.getBean(GamingConsole.class).up();
			 context.getBean(GameRunner.class).run();
			}

	}
}
