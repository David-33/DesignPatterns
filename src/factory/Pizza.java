package factory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by David on 04 Jun 2019, at 7:05 PM
 */
public abstract class Pizza {

    String mName;
    String mDough;
    String mSauce;
    List<String> mToppings = new ArrayList<>();

    void prepare() {
        System.out.println("Preparing ".concat(mName));
        System.out.println("Tossing dough...");
        System.out.println("Adding sauce...");
        System.out.println("Adding toppings: ");
        for (String topping : mToppings) {
            System.out.println("\t".concat(topping));
        }
    }

    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return mName;
    }

}
