package com.strategy;

public class MallardDuck extends Duck{

	public MallardDuck(FlyBehavior flyBehavior, QuackBehavior quackBehavior) {
		super(flyBehavior, quackBehavior);
	}

	@Override
	public void display() {
		System.out.println("Mallard Duck");
	}

}
