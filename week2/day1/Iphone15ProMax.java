package week2.day1;

public class Iphone15ProMax {
	
	int price = 199000;
	int sum;
	
	// Method Signature - accessModifier returntype methodName(inputArguments){}
	
	// void - no return
	
	
	public void takeSnap() {
		// command for the functions
		System.out.println("Cheese take a snap");
	}
	
	public void makeCall(String person) {
		System.out.println("Hey siri call " + person);		
	}
	
	
	
	public void openApp() {
		System.out.println("Hey siri open whatsapp");
	}
	
	
	public void sendMsg(String app, String person, String msg) {
		System.out.println("Hey siri open a "+app+ " and send a message to "+
	person+" and the message is " + msg);
	}
	
	public int addNum(int num1, int num2) {
		sum = num1 + num2;
		
		return sum;
	}
	
	public float mupltipy(int num1, float num2) {
		float output = num1*num2;
		return output;
	}
	
	
	public static void main(String[] args) {
		
		// Create object for Iphone15ProMax
		
		// object is myPhone
		
		Iphone15ProMax myPhone = new Iphone15ProMax();

		myPhone.openApp();
		myPhone.makeCall("Amma");
		myPhone.sendMsg("whatsapp", "Arun", "Call me at 1:00 pm");
		myPhone.makeCall("Ganesh");
		myPhone.makeCall("Dilip");
		
		System.out.println("==============================================");
		
		int addNum = myPhone.addNum(1, 2); // ctrl + 2 , l
		System.out.println(addNum);
		System.out.println(myPhone.mupltipy(2, 4.5f));
		
		System.out.println(myPhone.price);
		
		
		
	}

}
