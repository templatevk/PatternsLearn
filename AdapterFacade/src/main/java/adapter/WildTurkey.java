package adapter;

public class WildTurkey implements Turkey {
	@Override
	public void turkeyFly() {
		System.out.println("Fly");
	}
	
	@Override
	public void gobble() {
		System.out.println("Gobble");
	}
}
