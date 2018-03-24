package com.creational.singleton;

public class SynchronizedPrinterSingleton {
	
	//private constructor to restrict instantiation
	private SynchronizedPrinterSingleton () {}
	
	private static SynchronizedPrinterSingleton instance;
	
	private String id;
	
	public static SynchronizedPrinterSingleton getInstance() {
		//use synchronized and double if condition check
		if (instance == null) {
			synchronized(SynchronizedPrinterSingleton.class) {
				if (instance == null) {
					instance = new SynchronizedPrinterSingleton();
				}
			}
		}
		return instance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
