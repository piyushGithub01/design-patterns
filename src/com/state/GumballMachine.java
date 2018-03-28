package com.state;

public class GumballMachine {
	
	private State soldOutState;
	private State noQuarterState;
	private State hasQuarterState;
	private State soldState;
	
	private State state = soldOutState;
	private int count = 0;
	
	public GumballMachine(int numberOfGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
		this.count = numberOfGumballs;
		if (numberOfGumballs > 0) {
			state = noQuarterState;
		}
	}
	
	public void insertQuarter() {
		state.insertQuarter();
	}
	
	public void ejectQuater() {
		state.ejectQuarter();
	}
	
	public void turnCrank() {
		state.turnCrank();
		state.dispense();
	}
	
	void setState(State state) {
		this.state = state;
	}
	
	void releaseBall() {
		System.out.println("A gumball comes rolling out the slot ...");
		if (count != 0) {
			count = count - 1;
		}
	}

	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getState() {
		return state;
	}

	public int getCount() {
		return count;
	}

	@Override
	public String toString() {
		return "GumballMachine [soldOutState=" + soldOutState + ", noQuarterState=" + noQuarterState
				+ ", hasQuarterState=" + hasQuarterState + ", soldState=" + soldState + ", state=" + state + ", count="
				+ count + "]";
	}

}
