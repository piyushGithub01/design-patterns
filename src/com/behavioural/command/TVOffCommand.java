package com.behavioural.command;

public class TVOffCommand implements Command{
	
	TV tv;
	
	public TVOffCommand(TV tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		tv.turnOff();
	}
	
}
