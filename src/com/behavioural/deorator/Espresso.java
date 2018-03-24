package com.behavioural.deorator;

public class Espresso extends Beverage{

	public Espresso() {
		description = "ESPRESSO";
	}

	@Override
	public double getCost() {
		return 0.88;
	}
}
