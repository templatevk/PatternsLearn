package intro;

public interface FlyBehaviour {
	void fly();
}

class FlyNoWay implements FlyBehaviour {
	@Override
	public void fly() {
		System.out.println("I'm flying!!");
	}
}

class FlyWithWings implements FlyBehaviour {
	@Override
	public void fly() {
		System.out.println("I can't fly");
	}
}