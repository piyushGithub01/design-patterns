package com.template_method;

public class TemplateMethodTest {
	
	public static void main(String[] args) {
		CaffeineBeverage tea = new Tea();
		tea.prepareRecipe();
		
		CaffeineBeverage coffee = new Coffee();
		coffee.prepareRecipe();
	}

}
