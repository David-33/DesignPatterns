package factory;

/**
 * Created by David on 04 Jun 2019, at 7:43 PM
 */
public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new NYStyleCheesePizza();
            case "veggie":
                return new NYStyleVeggiePizza();
            case "clam":
                return new NYStyleClamPizza();
            case "pepperoni":
                return new NYStylePepperoniPizza();
        }
        return null;
    }

}
