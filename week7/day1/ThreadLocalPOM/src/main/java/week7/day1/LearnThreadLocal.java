package week7.day1;

public class LearnThreadLocal {
// access modifier static final ThreadLocal<Wrapper class> variableName = new ThreadLocal<wrapper class> ();
	
	private static final ThreadLocal<String> atmPin = new ThreadLocal<String>();
	private static final String pin  = "1234";
	
	String x = "123";
	String y = new String ("456");
	
	public void setPin() {
		// By using Set method will set data for the Thread
		atmPin.set("9876");
	}
	
	public String getPin() {
		// By using Get Method will get data from the Thread
		return atmPin.get();
	}
	
	public static void main(String[] args) {
		
		LearnThreadLocal ltl = new LearnThreadLocal();
		ltl.setPin();
		System.out.println(ltl.getPin());

	}

}
