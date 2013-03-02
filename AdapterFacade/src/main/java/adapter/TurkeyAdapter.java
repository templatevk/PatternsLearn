package adapter;

public class TurkeyAdapter implements Duck {
	private Turkey turkey;

	public TurkeyAdapter(Turkey turkey) {
		super();
		this.turkey = turkey;
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
