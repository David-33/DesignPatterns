package factory;

/**
 * Created by David on 04 Jun 2019, at 7:35 PM
 */
public class NYStyleCheesePizza extends Pizza {

    public NYStyleCheesePizza() {
        mName = "NY Style Sauce and Cheese Pizza";
        mDough = "Thin Crust Dough";
        mSauce = "Marinara Sauce";

        mToppings.add("Grated Reggiano Cheese");
    }

}
