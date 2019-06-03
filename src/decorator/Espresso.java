package decorator;

/**
 * Created by David on 03/Jun/2019, at 2:50 PM
 */
public class Espresso extends Beverage {

    public Espresso() {
        mDescription = "Espresso";
    }

    public Espresso(Size size) {
        super(size);
        mDescription = "Espresso";
    }

    @Override
    public double cost() {
        switch (mSize) {
            case SMALL:
                return .99;
            default:
            case MEDIUM:
                return 1.99;
            case BIG:
                return 2.99;
        }
    }
}
