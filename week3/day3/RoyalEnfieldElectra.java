package week3.day3;

public class RoyalEnfieldElectra {
	
	
	String cc = "350CC";

	public void wheels() {
		System.out.println("Spoke wheel");
	}
	
	public void speedometer() {
		System.out.println("Analog");
	}
	
	public void start() {
		String cc = "350CC";
		System.out.println("Kick start only " + cc);
	}
	
	public static void main(String[] args) {
		RoyalEnfieldElectra re = new RoyalEnfieldElectra();
		re.wheels();
		re.speedometer();
		re.start();

	}
	
	
}
