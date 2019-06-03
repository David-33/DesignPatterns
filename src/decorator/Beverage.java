package decorator;

/**
 * Created by David on 03/Jun/2019, at 2:46 PM
 */
public abstract class Beverage {

    public enum Size {
        SMALL,
        MEDIUM,
        BIG
    }

    String mDescription = "Unknown Beverage";
    Size mSize = Size.MEDIUM;

    public Beverage() {
    }

    public Beverage(Size size) {
        mSize = size;
    }

    public String getDescription() {
        return mDescription;
    }

    public Size getSize() {
        return mSize;
    }

    public abstract double cost();

}
