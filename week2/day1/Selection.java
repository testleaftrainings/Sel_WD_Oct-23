package week2.day1;

public class Selection {
	
	
	public void checkEligiblity(int age) {
		
		if(age>=18) {
			System.out.println("You are eligible to vote/buy a driving license");
		}else {
			System.out.println("you are not eligible");
		}
		
	}
	
	
	public void phone(int mark) {
		// above 70 percent -> i got iphone
		// above 90 percent -> i got macbook
		// below 70 percent -> nothing
		
		// && -- and operator ,  || -- or operator
		
		
		if(   (mark>=70)  &&   (mark<90)   ) {  // 95 >= 70
			System.out.println("I got iphone");
		}else if(  (mark >=90) || (mark>100)   ) {
			System.out.println("I got Macbook pro");
		}else if(  (mark<70)  && (mark>45)  ) {
			System.out.println("oops....");
		}else {
			System.out.println("condition is not satisfied");
		}
		
		
	}
	

	public static void main(String[] args) {
		
		Selection select = new Selection();
		select.checkEligiblity(28);
		select.phone(10);
		

	}

}
