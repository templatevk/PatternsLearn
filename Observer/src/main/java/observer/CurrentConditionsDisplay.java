package observer;

import java.util.*;

public class CurrentConditionsDisplay implements java.util.Observer, DisplayElement {
	private float temperature;
	private float humidity;
//	private Subject weatherData;
	private Observable observable;
	
	public CurrentConditionsDisplay(Observable o) {
		this.observable = o;
		o.addObserver(this);
	}
	
//	public CurrentConditionsDisplay(Subject weatherData) {
//		this.weatherData = weatherData;
//		weatherData.registerObserver(this);
//	}
	
	@Override
	public void update(Observable o, Object arg) {
		display();
		
	}
	
//	@Override
//	public void update(float temp, float humidity, float pressure) {
//		this.temperature = temp;
//		this.humidity = humidity;
//		display();
//	}
	
	@Override
	public void display() {
		System.out.println("Current conditions: " + temperature
				+ "F degrees and " + humidity + "% humidity");
	}

	public Observable getObservable() {
		return observable;
	}

	public void setObservable(Observable observable) {
		this.observable = observable;
	}
}
