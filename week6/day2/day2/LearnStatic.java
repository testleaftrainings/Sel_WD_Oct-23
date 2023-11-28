package week6.day2;

public class LearnStatic {
	
	// Syntax for static variable --> static dataType variableName = value;
	public static String name = "Testleaf";
	int num = 7;
	
	static {
		System.out.println("I'm static block "+name +" ");
		name="Qeagle";
	}
	
	public static void staticMethod() {
		LearnStatic obj = new LearnStatic();
		System.out.println(obj.num);
		obj.num = 25;
		System.out.println(name);
		System.out.println("Static Method");
	}

	public static void main(String[] args) {
		
		LearnStatic obj = new LearnStatic();
		System.out.println(obj.num);
		System.out.println(name);
		obj.normalMethod();
		System.out.println(obj.num);
		staticMethod();
	}
	
	public void normalMethod() {
		System.out.println(num);
		num = 25;
		System.out.println(name);
		System.out.println("Normal Method");
	}
	
	
	static {
		System.out.println("====================");
		System.out.println(name);
		System.out.println("====================");
	}
	

}
