package strategy;

/**
 * Created by David on 28/May/2019, at 4:54 PM
 */
public class MallardDuck extends Duck {

    public MallardDuck() {
        mQuackBehavior = new Quack();
        mFlyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm real Mallard duck");
    }
}
