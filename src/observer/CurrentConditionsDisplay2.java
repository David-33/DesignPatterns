package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by David on 03/Jun/2019, at 7:43 PM
 */
public class CurrentConditionsDisplay2 implements Observer, DisplayElement {

    Observable mObservable;
    private float mTemperature;
    private float mHumidity;


    public CurrentConditionsDisplay2(Observable observable) {
        mObservable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData2) {
            WeatherData2 weatherData2 = (WeatherData2) o;
            mTemperature = weatherData2.getTemperature();
            mHumidity = weatherData2.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + mTemperature + "F degrees and " + mHumidity + "% humidity");
    }

}
