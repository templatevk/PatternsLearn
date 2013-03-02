package command.artifacts;

public class Stereo {
	public void on() {
		System.out.println("Te volume is now on");
	}
	
	public void setCD() {
		System.out.println("The CD is set");
	}
	
	public void setVolume(int level) {
		System.out.println("The volume level set to " + level);
	}
}
