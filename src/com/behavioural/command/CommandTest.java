package com.behavioural.command;

public class CommandTest {
	
	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl(4);
		
		Light light = new Light();
		AC ac = new AC();
		TV tv = new TV();
		
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);
		ACOnCommand acOnCommand = new ACOnCommand(ac);
		ACOffCommand acOffCommand = new ACOffCommand(ac);
		TVOnCommand tvOnCommand = new TVOnCommand(tv);
		TVOffCommand tvOffCommand = new TVOffCommand(tv);
		
		rc.setCommad(0, lightOnCommand, lightOffCommand);
		rc.setCommad(1, acOnCommand, acOffCommand);
		rc.setCommad(2, tvOnCommand, tvOffCommand);
		
		rc.onButtonPressed(0);
		rc.onButtonPressed(1);
		rc.onButtonPressed(2);
		rc.offButtonPressed(0);
		rc.offButtonPressed(1);
		rc.offButtonPressed(2);
		
		Command[] partyOnCommand = {lightOnCommand, acOnCommand, tvOnCommand};
		Command[] partyOffCommand = {lightOffCommand, acOffCommand, tvOffCommand};
		PartyMacroCommand partyOn = new PartyMacroCommand(partyOnCommand);
		PartyMacroCommand partyOff = new PartyMacroCommand(partyOffCommand);
		rc.setCommad(3, partyOn, partyOff);
		rc.onButtonPressed(3);
		rc.offButtonPressed(3);
	}

}
