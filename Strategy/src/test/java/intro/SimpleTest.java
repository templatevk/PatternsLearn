package intro;

import intro2.*;

import org.junit.*;

import com.google.inject.*;

public class SimpleTest {
	@Test
	public void testInjection() {
		Injector injector = Guice.createInjector(new GameModule());
		GameCharacter character = injector.getInstance(Queen.class);
		character.fight();
	}
}
