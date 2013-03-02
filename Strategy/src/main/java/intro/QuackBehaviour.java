package intro;

public interface QuackBehaviour {
	void quack();
}

class Quack implements QuackBehaviour {
	@Override
	public void quack() {
		System.out.println("Quack");
	}
}

class MuteQuack implements QuackBehaviour {
	public void quack() {
		System.out.println("<< Silence >>");
	}
}