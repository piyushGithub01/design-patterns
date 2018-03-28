package com.state;

public class SoldOutState implements State{
	
	GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine) {
		this.gumballMachine = gumballMachine;
	}

	@Override
	public void insertQuarter() {
		System.out.println("You can not insert quarter, machine is sold out!");
	}

	@Override
	public void ejectQuarter() {
		System.out.println("You can not eject, you have not inserted quarter!");
	}

	@Override
	public void turnCrank() {
		System.out.println("You turned but there is no gumball!");
	}

	@Override
	public void dispense() {
		System.out.println("No gumball dispensed");
	}

}
