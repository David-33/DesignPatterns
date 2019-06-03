package observer;

/**
 * Created by David on 03/Jun/2019, at 7:25 PM
 */
public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
