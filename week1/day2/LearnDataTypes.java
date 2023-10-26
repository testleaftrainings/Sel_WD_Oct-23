package week1.day2;

public class LearnDataTypes {

	public static void main(String[] args) {
		
		// Integer - Numbers
		byte noOfVehicle = 2;
		short age = 28;
		int salary = 98765432; // Most used data type in the real time
		long cardNumber = 644456789025784l; // To use long data type , it should be ended with l/L
		
		System.out.println("no of vehicle : "+noOfVehicle);
		System.out.println(age);
		System.out.println(salary);
		System.out.println(cardNumber);
		
		//Float -- Decimal
		float petrolPrice = 108.67f; // Add either F or f to use float data type
		double pieValue = 3.14;
		System.out.println("petrol price : " + petrolPrice);
		
		//Character - accept only single digit 
		// it will written inside the single qoute or we have to use Ascii tables Value
		char logo = '0';
		System.out.println("Logo : " + logo);
		
		
		// boolean - yes or no 
		// use true or false --> in lowercase
		boolean haveYouHadYourBreakfast = false;
		System.out.println("Have you had your breakfast : " + haveYouHadYourBreakfast);
		
		//string
		// can hold sequence of character
		// it should be written inside the double quotes\
	
		String name = "Gokul";
		System.out.println("My name is : " + name + " I'm "  + age + " old" );
		System.out.println(noOfVehicle + " " +age);
		
	}

}
