package behavioral.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private Subject subject;
	private double temperature;
	private double humidity;

	public CurrentConditionsDisplay(Subject subject) {
		this.subject = subject;
		subject.registerObserver(this);
	}

	@Override
	public void display() {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}

	@Override
	public void update(double temperature, double humidity, double pressure) {
		System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
	}
}
