package com.example.day07;

public abstract class Player {
	public abstract void run();
	public abstract void jump();
	public abstract void turn();
	
	final public void go() {
		run();
		jump();
		turn();
	}
}
