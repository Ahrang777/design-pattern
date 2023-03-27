package behavioral.observer.weather;

public interface Observer {
	void update(double temp, double humidity, double pressure);
}
