package state;

public class GumbalMachine {
	private final static int SOLD_OUT = 0;
	private final static int NO_QUARTER = 1;
	private final static int HAS_QUARTER = 2;
	private final static int SOLD = 3;
	
	private int state = SOLD_OUT;
	private int count;
	
	public GumbalMachine(int count) {
		this.count = count;
		if (count > 0) {
			state = NO_QUARTER;
		}
	}
	
	public void insertQuarter() {
		switch (state) {
		case HAS_QUARTER:
			System.out.println("1");
			break;
		case NO_QUARTER:
			System.out.println("2");
			break;
		case SOLD_OUT:
			System.out.println("3");
			break;
		case SOLD:
			System.out.println("4");
			break;
		}
	}
	
	public void ejectQuarter() {
		switch (state) {
		case HAS_QUARTER:
			System.out.println("+1");
			break;
		case NO_QUARTER:
			System.out.println("+2");
			break;
		case SOLD_OUT:
			System.out.println("+3");
			break;
		case SOLD:
			System.out.println("+4");
			break;
		}
	}
}
