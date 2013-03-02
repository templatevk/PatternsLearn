package state;

public class NewMachine {
	private State soldOutState;
	private State noQuarterState;
	private State hasQuarterState;
	private State soldState;
	
	private State state = soldOutState;
	int count = 0;
	
	public NewMachine(int numberGumballs) {
		soldOutState = new SoldOutState(this);
		noQuarterState = new NoQuarterState(this);
		hasQuarterState = new HasQuarterState(this);
		soldState = new SoldState(this);
	}

	public void insertQuarter() {
		state.insertQuarter();
	}	
	
	public void ejectQuarter() {
		state.ejectQuarter();
	}
	
	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}
	
	public void setState(State state) {
		this.state = state;
	}
}
