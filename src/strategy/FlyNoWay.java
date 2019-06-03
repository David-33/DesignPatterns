package strategy;

/**
 * Created by David on 28/May/2019, at 4:52 PM
 */
public class FlyNoWay implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can't fly");
    }
}
