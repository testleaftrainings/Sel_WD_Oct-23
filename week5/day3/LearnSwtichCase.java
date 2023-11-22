package week5.day3;

import org.testng.annotations.Test;

public class LearnSwtichCase {

	@Test
	public void calender() {
		
		if(3!=4) {
			System.out.println("Both values are different");
		}
		
		String day = "day";
		switch(day) {
		case "monday":
			System.out.println("Monday It's working day");
			break;
		case "tuesday":
			System.out.println("Tuesdy It's working day");	
			break;
		case "wednesday":
			System.out.println("Wednesday It's working day");
			break;
		case "thursday":
			System.out.println("Thursday It's working day");
			break;
		case "friday":
			System.out.println("Friday Week-off");
			break;
		case "saturday":
			System.out.println("Saturday Week end");
			break;
		case "sunday":
			System.out.println("Sunday Week end");
			break;
		default :
			System.out.println("Invalid day");
		
		}
		
	}
	
	
}
