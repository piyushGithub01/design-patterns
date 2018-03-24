package com.creational.singleton;

public class PrinterSingleton {
	
	//private constructor - restrict instantiation
	private PrinterSingleton() {}
	
	//instantiate in beginning
	private static final PrinterSingleton instance = new PrinterSingleton();
	
	private String id;
	
	public static PrinterSingleton getInstance() {
		return instance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
}
