package observer;

import java.util.Observable;

/**
 * Created by David on 03/Jun/2019, at 7:39 PM
 */
public class WeatherData2 extends Observable {

    private float mTemperature;
    private float mHumidity;
    private float mPressure;

    public WeatherData2() {
    }

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        mTemperature = temperature;
        mHumidity = humidity;
        mPressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return mTemperature;
    }

    public float getHumidity() {
        return mHumidity;
    }

    public float getPressure() {
        return mPressure;
    }

}
