package observer;

import java.util.*;

public class WeatherData extends Observable {
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<>();
	}
	
	public void measurementsChanged() {
		setChanged();
		notifyObservers();
	}
	
//	@Override
//	public void registerObserver(Observer o) {
//		observers.add(o);
//	}
//	
//	@Override
//	public void removeObserver(Observer o) {
//		observers.remove(o);
//	}
//	
//	@Override
//	public void notifyObservers() {
//		System.out.println("Notifying observsers");
//		for (Observer observer : observers) {
//			observer.update(temperature, humidity, pressure);
//		}
//	}

	public float getTemperature() {
		return temperature;
	}

	public void setTemperature(float temperature) {
		this.temperature = temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public void setHumidity(float humidity) {
		this.humidity = humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public void setPressure(float pressure) {
		this.pressure = pressure;
	}
}
