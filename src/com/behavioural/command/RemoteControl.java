package com.behavioural.command;

public class RemoteControl {
	
	Command[] onCommands;
	Command[] offCommands;
	
	public RemoteControl(int slots) {
		onCommands = new Command[slots];
		offCommands = new Command[slots];
		Command noCommand = new NoCommand();
		for(int i=0; i<slots; i++) {
			onCommands[i]  = noCommand;
			offCommands[i] = noCommand;
		}
	}
	
	public void setCommad(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonPressed(int slot) {
		onCommands[slot].execute();
	}
	
	public void offButtonPressed(int slot) {
		offCommands[slot].execute();
	}

}
