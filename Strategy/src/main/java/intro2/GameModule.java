package intro2;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

public class GameModule extends AbstractModule {
	@Override
	protected void configure() {
	//	bind(GameCharacter.class).to;
	}
	
	@Provides
	public WeaponBehaviour provideWeapon(GameCharacter character) {
		if (character instanceof Queen) {
			return new SwordBehaviour();
		} else if (character instanceof Knight) {
			return new KnifeBehaviour();
		} else {
			return new BowAndArrowBehavoiur();
		}
	}
}
