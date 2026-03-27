package com.in28minutes.learn.spring.framework.game;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;


@Component
public class PacmanGame implements GamingConsole {

	public void up() {
		System.out.println(" PacmanGame up");
	}
	 
	public void down() {
		System.out.println("PacmanGame down");
	}
 
	public void left() {
		System.out.println("PacmanGame Left");
	}
 
	public void right() {
		System.out.println("PacmanGame Right");
	}
}
