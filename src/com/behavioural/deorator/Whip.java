package com.behavioural.deorator;

public class Whip extends CondimentDecorator{
	
	Beverage beverage;
	
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public String getDescription() {
		return beverage.getDescription() + ", WHIP ";
	}

	@Override
	public double getCost() {
		return 0.30 + beverage.getCost();
	}

}
