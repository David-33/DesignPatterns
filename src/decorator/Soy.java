package decorator;

/**
 * Created by David on 03/Jun/2019, at 3:01 PM
 */
public class Soy extends CondimentDecorator {
    Beverage mBeverage;

    public Soy(Beverage beverage) {
        mBeverage = beverage;
    }

    @Override
    public String getDescription() {
        return mBeverage.getDescription().concat(", Soy");
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
                cost += .15;
                break;
            case BIG:
                cost += .20;
                break;
        }
        return cost;
    }
}
