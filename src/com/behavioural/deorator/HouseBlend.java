package com.behavioural.deorator;

public class HouseBlend extends Beverage{

	public HouseBlend() {
		description = "HOUSE-BLEND";
	}
	
	@Override
	public double getCost() {
		return 0.99;
	}

}
