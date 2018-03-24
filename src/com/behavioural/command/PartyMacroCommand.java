package com.behavioural.command;

public class PartyMacroCommand implements Command{
	
	Command[] partyCommands;
	
	public PartyMacroCommand(Command[] commands) {
		this.partyCommands = commands;
	}

	@Override
	public void execute() {
		for(int i=0; i < partyCommands.length; i++) {
			partyCommands[i].execute();
		}
	}

}
