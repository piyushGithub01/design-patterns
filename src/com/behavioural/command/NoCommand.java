package com.behavioural.command;

public class NoCommand implements Command{

	@Override
	public void execute() {
		System.out.println("Does Nothing!");
	}

}
