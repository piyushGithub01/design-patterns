package com.strategy;

public abstract class Duck {

	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
	
	public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		this.flyBehavior = flyBehavior;
		this.quackBehavior = quackBehavior;
	}
	
	public void performFly() {
		flyBehavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public abstract void display();
}
