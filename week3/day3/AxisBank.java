package week3.day3;

public abstract class AxisBank implements RBI,AxisBankRules{

	public void kyc() {
		
		System.out.println("If the transcation is above 500000");
	}

	public void goldLoan() {
		
		System.out.println("Interest for the gold loan 8.7%");	
	}

	
	public  void deposit() {
		System.out.println("maximum deposit limit is 2000000");
	}
	
	public  void withdrawal() {
		System.out.println("maximum withdrawal limit is 100000");
	}
	
	public abstract void mobileBanking();
	
	public abstract void netBanking();
	
//	public abstract void proof();
	
}
