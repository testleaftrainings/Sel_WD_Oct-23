package week3.day3;

public class RoyalEnfieldClassic  extends RoyalEnfieldElectra{
	
	
	public void start() {
		String cc = "500CC";
		System.out.println("Kick start and electric start " + cc);
	}
	

	public static void main(String[] args) {
		RoyalEnfieldClassic re = new RoyalEnfieldClassic();
		re.wheels();
		re.speedometer();
		re.start();

	}

}
