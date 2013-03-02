package command;

import org.junit.*;

import command.artifacts.*;

public class SimpleTest {
	private static SimpleRemoteControl remote = new SimpleRemoteControl(); 
	
	@Ignore
	@Test
	public void test() {
		Light light = new Light();
		LightOnCommand lightOn = new LightOnCommand(light);
		
		remote.setCommand(lightOn);
		remote.buttonWasPressed();
	}
	
	@Ignore
	@Test
	public void test2() {
		remote.setCommand(new GarageDoorOpenCommand(
				new GarageDoor()));
		remote.buttonWasPressed();
	}
}
