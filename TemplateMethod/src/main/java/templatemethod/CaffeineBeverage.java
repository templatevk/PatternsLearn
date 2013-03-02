package templatemethod;

public abstract class CaffeineBeverage {
	public final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}
	
	protected abstract void brew();
	
	protected abstract void addCondiments();
	
	private void boilWater() {
		
	}
	
	private void pourInCup() {
		
	}
}
