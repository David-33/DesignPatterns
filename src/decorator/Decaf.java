package decorator;

/**
 * Created by David on 03/Jun/2019, at 2:55 PM
 */
public class Decaf extends Beverage {

    public Decaf() {
        mDescription = "Decaf Coffee";
    }

    public Decaf(Size size) {
        super(size);
        mDescription = "Decaf Coffee";
    }

    @Override
    public double cost() {
        switch (mSize) {
            case SMALL:
                return .50;
            default:
            case MEDIUM:
                return 1.05;
            case BIG:
                return 1.99;
        }
    }
}
