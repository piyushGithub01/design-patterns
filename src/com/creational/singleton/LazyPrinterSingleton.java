package com.creational.singleton;

public class LazyPrinterSingleton {
	
	//private constructor to restrict instantiation
	private LazyPrinterSingleton() {}
	
	private static LazyPrinterSingleton instance;
	
	private String id;
	
	public static LazyPrinterSingleton getInstance() {
		//instantiate lazily
		if (instance == null) 
			instance = new LazyPrinterSingleton();
		return instance;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
