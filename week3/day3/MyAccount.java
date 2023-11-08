package week3.day3;

public class MyAccount extends AxisBank {

	public void debitCard() {
		System.out.println("Debit card required");
	}
	
	
	public static void main(String[] args) {
		
		MyAccount acc = new MyAccount();
		acc.debitCard();
		acc.deposit();
		acc.withdrawal();
		acc.kyc();
		acc.netBanking();
		acc.mobileBanking();
	}


	public void mobileBanking() {
		System.out.println("Mobile Banking not required");
	}

	
	public void netBanking() {
		
		System.out.println("Net banking required");
	}

}
