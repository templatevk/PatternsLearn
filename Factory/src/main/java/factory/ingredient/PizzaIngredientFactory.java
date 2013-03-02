package factory.ingredient;

public interface PizzaIngredientFactory {
	Dough createDough();
	Sauce createSauce();
	Veggies[] createVeggies();
	Pepperoni createPepperoni();
	Clams createClam();
}
 
