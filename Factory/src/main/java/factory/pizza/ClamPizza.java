package factory.pizza;

import factory.ingredient.*;

public class ClamPizza extends Pizza {
	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	
	public void prepare() {
		System.out.println("Preparing " + name);
		dough = ingredientFactory.createDough();
		sauce = ingredientFactory.createSauce();
		clam = ingredientFactory.createClam();
	}
}
