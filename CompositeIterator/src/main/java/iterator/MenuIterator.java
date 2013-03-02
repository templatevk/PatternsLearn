package iterator;

public class MenuIterator implements MyIterator<Menu> {
	private Menu[] menus;
	private int position = 0;
	
	public MenuIterator(Menu[] menus) {
		this.menus = menus;
	}
	
	@Override
	public boolean hasNext() {
		return position < menus.length;
	}
	
	@Override
	public Menu next() {
		return menus[position++];
	}
}

class Menu {
	
}