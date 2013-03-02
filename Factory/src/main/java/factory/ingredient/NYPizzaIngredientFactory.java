package factory.ingredient;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
	@Override
	public Dough createDough() {
		return new ThickCrustDough();
	}
	
	@Override
	public Sauce createSauce() {
		return new SnakeSauce();
	}
	
	@Override
	public Veggies[] createVeggies() {
		return new Veggies[] { new Tomato(), new Onion() };
	}
	
	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}
	
	@Override
	public Clams createClam() {
		return new FriedClams();
	}
}