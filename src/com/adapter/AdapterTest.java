package com.adapter;

public class AdapterTest {
	
	public static void main(String[] args) {
		Duck duck = new MallardDuck();
		duck.quack();
		duck.fly();
		
		Duck turkey = new TurkeyAdapter(new WildTurkey());
		turkey.quack();
		turkey.fly();
	}

}
