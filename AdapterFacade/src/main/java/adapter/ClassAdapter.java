package adapter;

public class ClassAdapter implements Turkey, Duck {
	private Duck duck;
	private Turkey turkey;
	
	public ClassAdapter(Duck duck) {
		this.duck = duck;
	}
	
	public ClassAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	
	@Override
	public void turkeyFly() {
		duck.duckFly();		
	}
	
	@Override
	public void gobble() {
		duck.quack();
	}
	
	@Override
	public void quack() {
		turkey.gobble();
	}
	
	@Override
	public void duckFly() {
		turkey.turkeyFly();
	}
}
