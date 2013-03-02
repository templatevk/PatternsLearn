package intro2;

import javax.inject.Inject;

public abstract class GameCharacter {
	@Inject
	protected WeaponBehaviour weapon;
	
	public GameCharacter() {
		
	}
	
	public void fight() {
		weapon.useWeapon();
	}

	public void setWeapon(WeaponBehaviour weapon) {
		this.weapon = weapon;
	}
}
