package factory;

/**
 * Created by David on 04 Jun 2019, at 7:43 PM
 */
public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(String type) {
        switch (type) {
            case "cheese":
                return new ChicagoStyleCheesePizza();
            case "veggie":
                return new ChicagoStyleVeggiePizza();
            case "clam":
                return new ChicagoStyleClamPizza();
            case "pepperoni":
                return new ChicagoStylePepperoniPizza();
        }
        return null;
    }

}
