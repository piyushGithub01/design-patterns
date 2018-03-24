package com.creational.singleton;

public class SingletonTest {

	public static void main(String[] args) {

		SingletonTest tester = new SingletonTest();
		
		PrinterSingleton printerSingleton = PrinterSingleton.getInstance();
		printerSingleton.setId("1");
		tester.checkEqualById(printerSingleton.getId(), PrinterSingleton.getInstance().getId());
		
		LazyPrinterSingleton lazy = LazyPrinterSingleton.getInstance();
		lazy.setId("2");
		tester.checkEqualById(lazy.getId(), LazyPrinterSingleton.getInstance().getId());
		
		SynchronizedPrinterSingleton sync = SynchronizedPrinterSingleton.getInstance();
		sync.setId("3");
		tester.checkEqualById(sync.getId(), SynchronizedPrinterSingleton.getInstance().getId());
		
		System.out.println("********** Test Complete ***********");
		
	}
	
	private void checkEqualById(String id1, String id2) {
		if(!id1.equalsIgnoreCase(id2)) {
			System.out.println("********* FAILED ***********");
		}
	}

}
