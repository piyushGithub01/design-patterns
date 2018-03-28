package com.strategy;

public class StrategyTest {
	
	public static void main(String[] args) {
		Duck mallardDuck = new MallardDuck(new FlyWithWings(), new LoudQuack());
		mallardDuck.display();
		mallardDuck.performFly();
		mallardDuck.performQuack();
		
		Duck silentMallardDuck = new MallardDuck(new FlyWithWings(), new MuteQuack());
		silentMallardDuck.display();
		silentMallardDuck.performFly();
		silentMallardDuck.performQuack();
	}

}
