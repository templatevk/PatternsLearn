package factory.store;

import factory.ingredient.*;
import factory.pizza.*;

class ChikagoPizzaStore extends PizzaStore {
	protected PizzaIngredientFactory ingredientFactory;
	
	public ChikagoPizzaStore() {
		ingredientFactory = new NYPizzaIngredientFactory();
	}
	
	@Override
	protected Pizza createPizza(String type) {
		Pizza pizza = null;
		
		if (type.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
		} else if (type.equals("clam")) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Syle Clam Pizza");
		}
		
		return pizza;
	}
}