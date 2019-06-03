package strategy;

/**
 * Created by David on 28/May/2019, at 4:51 PM
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying!!");
    }
}
