package factory.ingredient;

public class ChikagoPizzaIngredientFactory implements PizzaIngredientFactory {
	@Override
	public Dough createDough() {
		return new ThinCrustDough();
	}
	
	@Override
	public Sauce createSauce() {
		return new ArinaraSauce();
	}
	
	@Override
	public Veggies[] createVeggies() {
		return new Veggies[] { new Garlic(), new Onion() };
	}
	
	@Override
	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}
	
	@Override
	public Clams createClam() {
		return new FreshClams();
	}
}