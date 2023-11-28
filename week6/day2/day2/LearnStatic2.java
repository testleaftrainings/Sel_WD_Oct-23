package week6.day2;

public class LearnStatic2 extends LearnStatic{
	
	// Static method cannot be override
	public static void staticMethod() {
		System.out.println("This is Static method");
	}
	
	public void normalMethod() {
		
	}

	public static void main(String[] args) {
		
		LearnStatic ls = new LearnStatic();
		ls.normalMethod();
		staticMethod(); // This is from LearnStatic2
		LearnStatic.staticMethod(); // This is from LearnStatic
	}

}
