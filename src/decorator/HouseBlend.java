package decorator;

/**
 * Created by David on 03/Jun/2019, at 2:53 PM
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        mDescription = "House Blend Coffee";
    }

    public HouseBlend(Size size) {
        super(size);
        mDescription = "House Blend Coffee";
    }

    @Override
    public double cost() {
        switch (mSize) {
            case SMALL:
                return .49;
            default:
            case MEDIUM:
                return .89;
            case BIG:
                return 1.99;
        }
    }
}
