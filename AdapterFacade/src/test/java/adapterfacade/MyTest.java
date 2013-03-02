package adapterfacade;

import org.junit.*;

import facade.*;

import adapter.*;

public class MyTest {
	@Ignore
	@Test
	public void adapter() {
		Turkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		turkeyAdapter.quack();
		turkeyAdapter.duckFly();
		
		turkey = new DuckAdapter(new MallardDuck());
		turkey.gobble();
		turkey.turkeyFly();
	}
	
	@Test
	public void facade() {
		new HomeTheaterFacade(new Amplifier(),
				new Tuner(), new DvdPlayer(), new CdPlayer(),
				new Projector(), new TheaterLights(), new Screen(),
				new PopcornPopper()).watchMovie("movie");
	}
}
