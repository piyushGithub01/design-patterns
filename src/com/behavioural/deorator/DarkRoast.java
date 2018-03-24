package com.behavioural.deorator;

public class DarkRoast extends Beverage{
	
	public DarkRoast() {
		description = "DARK-ROAST";
	}

	@Override
	public double getCost() {
		return 0.77;
	}

}
