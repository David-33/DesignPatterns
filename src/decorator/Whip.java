package decorator;

/**
 * Created by David on 03/Jun/2019, at 3:01 PM
 */
public class Whip extends CondimentDecorator {
    Beverage mBeverage;

    public Whip(Beverage beverage) {
        mBeverage = beverage;
    }

    @Override
    public String getDescription() {
        return mBeverage.getDescription().concat(", Whip");
    }

    @Override
    public Size getSize() {
        return mBeverage.getSize();
    }

    @Override
    public double cost() {
        double cost = mBeverage.cost();
        switch (getSize()) {
            case SMALL:
                cost += .05;
                break;
            default:
            case MEDIUM:
                cost += .10;
                break;
            case BIG:
                cost += .15;
                break;
        }
        return cost;
    }
}
