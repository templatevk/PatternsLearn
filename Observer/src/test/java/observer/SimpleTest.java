package observer;

import java.util.*;

import org.junit.*;

public class SimpleTest {
	@Ignore
	@Test
	public void test1() {
//		WeatherData weatherData = new WeatherData();
//		
//		CurrentConditionsDisplay currentDisplay =
//				new CurrentConditionsDisplay(weatherData);
//		StatisticsDisplay statisticsDisplay = 
//				new StatisticsDisplay(weatherData);
//		
//		weatherData.setHumidity(50);
//		weatherData.setPressure(55);
//		weatherData.setTemperature(99);
//		weatherData.notifyObservers();
	}
	
	@Test
	public void test2() {
		WeatherData o = new WeatherData();
		new CurrentConditionsDisplay(o);
		new CurrentConditionsDisplay(o);
		o.measurementsChanged();
	}
}
