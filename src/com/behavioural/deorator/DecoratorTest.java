package com.behavioural.deorator;

public class DecoratorTest {
	
	public static void main(String[] args) {
		Beverage bev1 = new DarkRoast();
		bev1 = new Whip(bev1);
		System.out.println("Beverage Name: " + bev1.getDescription() + " costs " + bev1.getCost());
		
		Beverage bev2 = new HouseBlend();
		bev2 = new Milk(bev2);
		bev2 = new Milk(bev2);
		bev2 = new Mocha(bev2);
		System.out.println("Beverage Name: " + bev2.getDescription() + " costs " + bev2.getCost());
	}

}
