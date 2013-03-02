package templatemethod;

public abstract class Food {
	public final void prepare() {
		boil();
		if (needsMagic()) {
			cast();
		}
	}
	
	private void boil() {
		
	}
	
	protected boolean needsMagic() {
		return false;
	}
	
	protected abstract void cast();
}


class MagicFood extends Food {
	@Override
	protected boolean needsMagic() {
		return true;
	}	
	
	@Override
	protected void cast() {
			
	}
}