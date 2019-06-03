package strategy;

/**
 * Created by David on 28/May/2019, at 5:08 PM
 */
public class ModelDuck extends Duck {

    public ModelDuck() {
        mFlyBehavior = new FlyNoWay();
        mQuackBehavior = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a model duck");
    }
}
