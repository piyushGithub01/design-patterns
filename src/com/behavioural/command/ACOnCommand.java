package com.behavioural.command;

public class ACOnCommand implements Command{

	AC ac;
	
	public ACOnCommand(AC ac) {
		this.ac = ac;
	}

	@Override
	public void execute() {
		ac.turnOn();
	}
	
}
