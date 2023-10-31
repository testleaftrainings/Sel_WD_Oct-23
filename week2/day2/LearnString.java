package week2.day2;

public class LearnString {

	public static void main(String[] args) {
		// Type 1 : String Literal
		// Syntax dataType variableName = "Value";
		String name1 = "Testleaf";
		String name2 = "Testleaf";
		
		int num1= 2;
		int num2 = 2;
		if(num1==num2) {
			System.out.println("Both nums are same");
		}else {
			System.out.println("Both nums are not same");
		}

		
		if(name1==name2) {
			System.out.println("Both are same");
		}else {
			System.out.println("Both are not same");
		}
		
		
		System.out.println("====================");
		
		/// Type 2 : String Instantiation
		
		// Syntax dataType variableName = new dataType("Value");
		
		String name3 = new String("Testleaf");
		String name4 = new String("testleaf");
		
		if(name4==name3) {
			System.out.println("Both are same");
		}else {
			System.out.println("Both are not same");
		}
		
		
		// To get the length of the String --> length();
		int length1 = name1.length();
		int length3 = name3.length();
		
		
		// To check both String values are equal
		
		if(name1.equals(name3)) {
			System.out.println("Both values are same");
		}else {
			System.out.println(" Both values are different");
		}
		

		if(name1.equals(name4)) {
			System.out.println("Both values are same");
		}else {
			System.out.println(" Both values are different");
		}
		
		// To Compare values without case sensitive
		if(name1.equalsIgnoreCase(name4)) {
			System.out.println("Both values are same");
		}else {
			System.out.println(" Both values are different");
		}
		
		
		// To check part of word or char
		if(name1.contains("test")) {
			System.out.println("The word Test is present");
		}else {
			System.out.println("The word Test is not present");
		}
		
		
		
		String name = "Gokul";
		char[] charArray = name.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}
	}

}
