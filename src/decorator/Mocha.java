package decorator;

/**
 * Created by David on 03/Jun/2019, at 2:57 PM
 */
public class Mocha extends CondimentDecorator {
    Beverage mBeverage;

    public Mocha(Beverage beverage) {
        mBeverage = beverage;
    }

    @Override
    public String getDescription() {
        return mBeverage.getDescription().concat(", Mocha");
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
                cost += .10;
                break;
            default:
            case MEDIUM:
                cost += .20;
                break;
            case BIG:
                cost += .30;
                break;
        }
        return cost;
    }
}
