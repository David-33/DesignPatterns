package strategy;

/**
 * Created by David on 28/May/2019, at 4:54 PM
 */
public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }
}
