package week6.day3;

public class LearnThisKeyword {
	String idNum;
	
	public void emplyee() {
		this.emplyeDetails();
		System.out.println("Employee Name : ");
	}
	
	public void empId(String idNum) {
		System.out.println("===============");
//		LearnThisKeyword ltk = new LearnThisKeyword();
//		ltk.idNum= idNum;
		this.idNum =idNum;
		this.emplyee();
		System.out.println("Local Variable "+idNum);
		this.emplyeDetails();
		System.out.println("Global Variable "+this.idNum);
		System.out.println("===============");
	}
	
	public void emplyeDetails() {
		
		System.out.println("Employee Detail : ");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnThisKeyword ltk = new LearnThisKeyword();
		ltk.empId("TL049");
		
	}

}
