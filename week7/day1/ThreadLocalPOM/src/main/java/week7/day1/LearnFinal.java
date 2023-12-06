package week7.day1;

public class LearnFinal {
	// Gobal variable
	int x = 10;

	final int a = 10;
	
	public void m1() {
		x = 20;
//		a = 20;  if it is final can't able to change the value. 
	}
	
	public final void m2() {
		
	}
	
	public final void m2(int x) {
		
	}
	public static void main(String[] args) {
		LearnFinal lf = new LearnFinal();
		System.out.println(lf.x);
		lf.m1();
		System.out.println(lf.x);
		System.out.println("==============");
		System.out.println(lf.a);
	}

}
