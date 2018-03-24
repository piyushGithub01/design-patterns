package com.creational.builder;

public class Employee {
	
	private final String id;
	
	private final String name;
	
	private final String address;
	
	private final int salary;
	
	private Employee(Builder builder) {
		this.address = builder.address;
		this.id = builder.id;
		this.name = builder.name;
		this.salary = builder.salary;
	}
	
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public int getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}

	public static class Builder {
		
		private String id;
		
		private String name;
		
		private String address;
		
		private int salary;
		
		private Builder(String id, String name) {
			this.id = id;
			this.name = name;
		}
		
		public static Builder newBuilder(String id, String name) {
			return new Builder(id, name);
		}
		
		public Employee build() {
			return new Employee(this);
		}
		
		public Builder setAddress(String address) {
			this.address = address;
			return this;
		}
		
		public Builder setSalary(int salary) {
			this.salary = salary;
			return this;
		}
	}

}
