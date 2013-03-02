package state;

public interface State {
	void insertQuarter();
	void ejectQuarter();
}

class SoldState implements State {
	private NewMachine machine;
	
	public SoldState(NewMachine machine) {
		this.machine = machine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("Inserting quarter from SoldState state");
		machine.setState(machine.getSoldOutState());
	}

	@Override
	public void ejectQuarter() {
		
	}
}

class SoldOutState implements State {
	private NewMachine machine;
	
	public SoldOutState(NewMachine machine) {
		this.machine = machine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("Inserting quarter from SoldOutState state");
		machine.setState(machine.getHasQuarterState());
	}

	@Override
	public void ejectQuarter() {
		
	}
}

class HasQuarterState implements State {
	private NewMachine machine;
	
	public HasQuarterState(NewMachine machine) {
		this.machine = machine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("Inserting quarter from HasQuarterState state");
		machine.setState(machine.getNoQuarterState());
	}

	@Override
	public void ejectQuarter() {
		
	}
}

class NoQuarterState implements State {
	private NewMachine machine;
	
	public NoQuarterState(NewMachine machine) {
		this.machine = machine;
	}
	
	@Override
	public void insertQuarter() {
		System.out.println("Inserting quarter from NoQuarterState state");
		machine.setState(machine.getSoldState());
	}

	@Override
	public void ejectQuarter() {
		
	}
}