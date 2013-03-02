package adapter;

public class DuckAdapter implements Turkey  {
	private Duck duck;

	public DuckAdapter(Duck duck) {
		super();
		this.duck = duck;
	}
	
	@Override
	public void turkeyFly() {
		duck.duckFly();
	}
	
	@Override
	public void gobble() {
		duck.quack();
	}
}
