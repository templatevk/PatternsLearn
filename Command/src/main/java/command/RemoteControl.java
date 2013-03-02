package command;

public class RemoteControl {
	private static final int COMMANDS_COUNT = 7;
	
	private Command[] onCommands;
	private Command[] offCommands;
	
	public RemoteControl() {
		onCommands = new Command[COMMANDS_COUNT];
		offCommands = new Command[COMMANDS_COUNT];
		
		Command noCommand = new NoCommand();
		for (int i = 0; i < COMMANDS_COUNT; ++i) {
			offCommands[i] = onCommands[i] = noCommand;
		}
	}
	
	public void setCommand(int slot, Command onCommand, 
			Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonDown(int slot) {
		onCommands[slot].execute();
	}
	
	public void offButtonDown(int slot) {
		offCommands[slot].execute();
	}
}
