package observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by David on 03/Jun/2019, at 7:28 PM
 */
public class WeatherData implements Subject {

    private List<Observer> mObservers;
    private float mTemperature;
    private float mHumidity;
    private float mPressure;


    public WeatherData() {
        mObservers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        mObservers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = mObservers.indexOf(o);
        if (i >= 0) {
            mObservers.remove(i);
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : mObservers) {
            observer.update(mTemperature, mHumidity, mPressure);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        mTemperature = temperature;
        mHumidity = humidity;
        mPressure = pressure;
        measurementsChanged();
    }

}
