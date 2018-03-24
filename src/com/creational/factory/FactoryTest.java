package com.creational.factory;

public class FactoryTest {
	
	public static void main(String[] args) {
		FactoryTest tester = new FactoryTest();
		
		Bot dumb = BotFactory.getInstance().getBot("DUMB");
		tester.checkBotBehaviour("DUMB", dumb.behaves());
		
		Bot chat = BotFactory.getInstance().getBot("CHAT");
		tester.checkBotBehaviour("CHAT", chat.behaves());
		
		Bot marketing = BotFactory.getInstance().getBot("MARKETING");
		tester.checkBotBehaviour("MARKETING", marketing.behaves());
		
		System.out.println("******* TEST COMPLETE ********");
	}
	
	private void checkBotBehaviour(String expected, String actual) {
		if(!expected.equalsIgnoreCase(actual))
			System.out.println("******** FAILED **********");
	}

}
