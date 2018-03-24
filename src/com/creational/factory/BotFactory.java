package com.creational.factory;

public class BotFactory {
	
	private BotFactory() {}
	
	private static final BotFactory instance = new BotFactory();
	
	public static BotFactory getInstance() {
		return instance;
	}
	
	public Bot getBot(String type) {
		Bot bot;
		switch(type) {
		  case "DUMB":
			  bot = new DumbBot();
			  break;
		  case "CHAT":
			  bot = new ChatBot();
			  break;
		  case "MARKETING":
			  bot = new MarketingBot();
			  break;
		  default:
			  bot = new DumbBot();
		}
		return bot;
	}

}
