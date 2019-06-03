package observer;

/**
 * Created by David on 03/Jun/2019, at 7:32 PM
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float mTemperature;
    private float mHumidity;
    private Subject mWeatherData;


    public CurrentConditionsDisplay(Subject weatherData) {
        mWeatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        mTemperature = temperature;
        mHumidity = humidity;
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + mTemperature + "F degrees and " + mHumidity + "% humidity");
    }

}
