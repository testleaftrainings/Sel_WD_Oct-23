package week3.day3;

public class Calculator {
	
	//  Static polymorphism / method overloading/ 
	
	public void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public void additon(int a, int b) {
		System.out.println(a+b);
	}
	
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	
	
	public float add(int a, float b) {
		System.out.println(a+b);
		return a+b;
	}
	
	public void add(float a, int b) {
		System.out.println(a+b);
	}
	
	public void add(double a, int b) {
		System.out.println(a+b);
	}
	
	public long sub(int x, long y) {
		return y-x;
	}
	
	
	public void multiply() {
		
	}
	
	public void division() {
		
	}
	
	

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		cal.add(2, 2);
		cal.add(2.5, 2);
		cal.add(5, 3.7f);
		cal.add(2f, 3);

	}

}
