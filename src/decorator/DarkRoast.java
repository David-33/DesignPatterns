package decorator;

/**
 * Created by David on 03/Jun/2019, at 2:54 PM
 */
public class DarkRoast extends Beverage {

    public DarkRoast() {
        mDescription = "Dark Roast Coffee";
    }

    public DarkRoast(Size size) {
        super(size);
        mDescription = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        switch (mSize) {
            case SMALL:
                return .40;
            default:
            case MEDIUM:
                return .99;
            case BIG:
                return 1.40;
        }
    }
}
