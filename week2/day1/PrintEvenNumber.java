package week2.day1;

public class PrintEvenNumber {
	
	
	public void printEvenNum() {
		
		for(int i=0; i<10; i++) {
			// Number which is divisble by 2 and the reminder should be zero
			
			// dividson -- /
			// reminder -- % (mod)
			
			if(i%2==0) {
				System.out.println(i);
			}
			
//			System.out.println(i/2);
//			System.out.println(i%2);
			
		}

	
	}
		
	
	

	public static void main(String[] args) {
		PrintEvenNumber num = new PrintEvenNumber();
		num.printEvenNum();
		
	}		

}
