package week2.day2;

import java.util.Scanner;

public class PrimeNumber {

	
	public void checkPrime(int num) {
		boolean flag = false;
		
		for(int i=2; i<num; i++) {
			
			if(num%i==0) {
				flag=true;
			}
			
		}
		
		if(flag==false) {
			System.out.println("The number " + num +" is prime");
		}else {
			System.out.println("The number " + num +" is  not a prime");
		}
	}
	
	
	
	public static void main(String[] args) {
		
//		Scanner scan =new Scanner(System.in);
//		System.out.println("Enter the input");
//		int num = scan.nextInt();
//		
//		int num = 7;
		
		PrimeNumber prime = new PrimeNumber();
		prime.checkPrime(7);
		prime.checkPrime(13);
		prime.checkPrime(15);
		

	}

}
