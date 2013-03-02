package factory.pizza;

import factory.ingredient.*;

public abstract class Pizza {
	protected PizzaIngredientFactory ingredientFactory;
	protected String name;
	protected Dough dough;
	protected Sauce sauce;
	protected Veggies veggies[];
	protected Pepperoni pepperoni;
	protected Clams clam;
	
	public abstract void prepare();
	
	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}
	
	public void bake() {
		System.out.println("Bake for 25 minutes at 350");

	}
	
	public void box() {
		System.out.println("Place pizza in official PizzaStore box");
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}