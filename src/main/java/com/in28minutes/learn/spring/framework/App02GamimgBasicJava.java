package com.in28minutes.learn.spring.framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.in28minutes.learn.spring.framework.game.GameRunner;
import com.in28minutes.learn.spring.framework.game.SuperContraGame;

public class App02GamimgBasicJava {
	public static void main(String[] args) {
   
		var context =new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
    
	   
	    
	    System.out.println( context.getBean("name"));
	    
	    System.out.println( context.getBean("age"));

	    System.out.println( context.getBean("age"));

	    System.out.println( context.getBean("age2"));
	    System.out.println( context.getBean("age3"));

	    System.out.println( context.getBean("person"));

	    System.out.println( context.getBean("address2"));

	    System.out.println( context.getBean(Address.class));

	}
}
