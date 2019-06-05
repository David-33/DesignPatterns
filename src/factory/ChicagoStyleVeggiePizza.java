package factory;

/**
 * Created by David on 04 Jun 2019, at 7:38 PM
 */
public class ChicagoStyleVeggiePizza extends Pizza {

    public ChicagoStyleVeggiePizza() {
        mName = "Chicago Style Veggie Pizza";
        mDough = "Extra Thick Crust Dough";
        mSauce = "Plum Tomato Sauce";
    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }

}
