package command;

import org.junit.*;

import command.artifacts.*;

public class GeneralTest {
	@Test
	public void test() {
		RemoteControl ctrl = new RemoteControl();
		ctrl.setCommand(0, new LightOnCommand(new Light()),
				new LightOffCommand(new Light()));
		ctrl.onButtonDown(0);
		ctrl.offButtonDown(0);
	}
}
