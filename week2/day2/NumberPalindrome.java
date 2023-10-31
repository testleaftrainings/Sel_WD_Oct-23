package week2.day2;

public class NumberPalindrome {

	public static void main(String[] args) {
	
		int input = 5;  
		int output= 0;
		for (int i =input; i >0; i=i/10) {
			
			// To get the last digit // 121/10
			int lastNum = i%10;
			output = (output*10) +lastNum;
		}
		System.out.println(output);

	}

}
