package strategy;

/**
 * Created by David on 28/May/2019, at 4:46 PM
 */
public abstract class Duck {

    FlyBehavior mFlyBehavior;
    QuackBehavior mQuackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performFly() {
        mFlyBehavior.fly();
    }

    public void performQuack() {
        mQuackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setFlyBehavior(FlyBehavior fb) {
        mFlyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        mQuackBehavior = qb;
    }

}
