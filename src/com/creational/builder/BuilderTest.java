package com.creational.builder;

public class BuilderTest {

	public static void main(String[] args) {

		Employee emp = Employee.Builder.newBuilder("id1", "name1")
				.setAddress("adr")
				.setSalary(100)
				.build();
		
		System.out.println(" Employee using builder pattern: " + emp);
	}

}
