package week1.day2;

public class Car {
	// Global variable will be in blue color
	 String carName;
//	public String carColor;
	// Normal Method
		public void applyBreak() {
			System.out.println("Break is applied");
			carName = "Polo";
		String carColor = "green";
			// local variable will be in brown color
//			String carName;
		}
	

	// main method -- entry point
	public static void main(String[] args) {
		// Create object for the class 
	// Syntax is 
		// ClassName object = new ClassName();
//		carName = "countryMan"; --> with the help of obj alone we can call
		Car polo = new Car();
		polo.carName = "mini";
//		polo.applyBreak();
		polo.soundHorn();
		
		

	}
	
	// Access modifier returnType methodName(input arguments){
//}
	
	
	
	 void soundHorn() {
//		 carColor = "blue";
		 carName = "countryMan"; 
	System.out.println("Horned ");	
	}

}
