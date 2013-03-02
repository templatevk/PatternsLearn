package command;

import command.artifacts.*;

public class StereoOnWithCDCommand implements Command {
	private Stereo stereo;

	public StereoOnWithCDCommand(Stereo stereo) {
		super();
		this.stereo = stereo;
	}
	
	@Override
	public void execute() {
		stereo.on();
		stereo.setCD();
		stereo.setVolume(1);
	}
}
