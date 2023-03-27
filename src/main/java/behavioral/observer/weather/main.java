package behavioral.observer.weather;

public class main {
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		Observer observer = new CurrentConditionsDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4);
		weatherData.setMeasurements(82, 70, 30.4);
		weatherData.setMeasurements(77, 77, 20.4);
	}
}
