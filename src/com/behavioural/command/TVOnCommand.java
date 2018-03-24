package com.behavioural.command;

public class TVOnCommand implements Command {
	
	TV tv;
	
	public TVOnCommand(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.turnOn();
	}

}
