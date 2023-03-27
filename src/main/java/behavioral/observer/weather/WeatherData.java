package behavioral.observer.weather;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{
	private List<Observer> observers;
	private double temperature;
	private double humidity;
	private double pressure;

	public WeatherData() {
		this.observers = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		if (observers.contains(observer)) {
			observers.remove(observer);
		}
	}

	@Override
	public void notifyObservers() {
		observers.forEach(observer -> observer.update(temperature, humidity, pressure));
	}

	public void measurementsChanged() {
		notifyObservers();
	}

	public void setMeasurements(double temperature, double humidity, double pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		measurementsChanged();
	}
}
