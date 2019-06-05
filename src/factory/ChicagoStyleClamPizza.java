package factory;

/**
 * Created by David on 04 Jun 2019, at 7:38 PM
 */
public class ChicagoStyleClamPizza extends Pizza {

    public ChicagoStyleClamPizza() {
        mName = "Chicago Style Clam Pizza";
        mDough = "Extra Thick Crust Dough";
        mSauce = "Plum Tomato Sauce";

        mToppings.add("Shredded Mozzarella Cheese");
    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

}
