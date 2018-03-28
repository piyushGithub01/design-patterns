package com.observer;

public class ObserverTest {
	
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionDisplay currentDisplay = new CurrentConditionDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}

}
