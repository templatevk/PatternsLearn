package command;

import command.artifacts.*;

public class LightOnCommand implements Command {
	protected Light light;

	public LightOnCommand(Light light) {
		super();
		this.light = light;
	}
	
	@Override
	public void execute() {
		light.on();
	}
}
