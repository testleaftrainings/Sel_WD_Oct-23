package week7.day1;

public class LearnEncapsulation {
	
	private String setPin() {
		System.out.println("ATM Pin set successfully");
		return "1234";
	}
	
	public String getPin() {
		return setPin();
	}

	public static void main(String[] args) {
		
		LearnEncapsulation le = new LearnEncapsulation();
		String pin = le.getPin();
		System.out.println(pin);

	}

}
