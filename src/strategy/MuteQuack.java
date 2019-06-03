package strategy;

/**
 * Created by David on 28/May/2019, at 4:53 PM
 */
public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
