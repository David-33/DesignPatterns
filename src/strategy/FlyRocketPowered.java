package strategy;

/**
 * Created by David on 28/May/2019, at 5:09 PM
 */
public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I'm flying with a rocket!");
    }
}
