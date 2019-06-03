package observer;

/**
 * Created by David on 03/Jun/2019, at 7:36 PM
 */
public class WeatherStation {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        weatherData.setMeasurements(82, 70, 29.2f);
        weatherData.setMeasurements(78, 90, 29.2f);
        System.out.println();

        //-----------------Native Java Observers------------------------------------------------
        WeatherData2 weatherData2 = new WeatherData2();
        CurrentConditionsDisplay2 currentDisplay2 = new CurrentConditionsDisplay2(weatherData2);

        weatherData2.setMeasurements(80, 65, 30.4f);
        weatherData2.setMeasurements(82, 70, 29.2f);
        weatherData2.setMeasurements(78, 90, 29.2f);
    }

}
