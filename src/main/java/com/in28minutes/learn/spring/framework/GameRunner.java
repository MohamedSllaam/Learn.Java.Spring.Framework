package com.in28minutes.learn.spring.framework;

public class GameRunner {
	MarioGame game; 
	
	public GameRunner(MarioGame game) {
		 this.game= game;
	}

	public void run() {
	 System.out.println("Running ga,e: " +game);
	 game.up();
	 game.down();
	 game.left();
	 game.right();
	}
}
