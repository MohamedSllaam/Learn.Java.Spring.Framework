package com.in28minutes.learn.spring.framework.game;

public class MarioGame implements GamingConsole {
 
	 
	public void up() {
		System.out.println("Jumo");
	}
	
	 
	public void down() {
		System.out.println("Go into ahole");
	}
	
 
	public void left() {
		System.out.println("Go back");
	}
	
	 
	public void right() {
		System.out.println("Accelerate");
	}
}
