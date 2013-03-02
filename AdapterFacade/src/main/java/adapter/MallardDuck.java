package adapter;

public class MallardDuck implements Duck {
	@Override
	public void quack() {
		System.out.println("Quack");
	}
	
	@Override
	public void duckFly() {
		System.out.println("Fly");
	}
}
