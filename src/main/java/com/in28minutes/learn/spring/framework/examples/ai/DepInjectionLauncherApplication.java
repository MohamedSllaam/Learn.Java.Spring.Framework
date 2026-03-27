package com.in28minutes.learn.spring.framework.examples.ai;

import java.util.Arrays;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.in28minutes.learn.spring.framework.game.GameRunner;
import com.in28minutes.learn.spring.framework.game.GamingConsole;

@Configuration
@ComponentScan("com.in28minutes.learn.spring.framework.game")
public class DepInjectionLauncherApplication {

	public static void main(String[] args) {

		try(var context =new AnnotationConfigApplicationContext(DepInjectionLauncherApplication.class))
      		{
				  
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			}
	}
}
