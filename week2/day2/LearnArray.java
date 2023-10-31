package week2.day2;

import java.util.Arrays;

public class LearnArray {

	public static void main(String[] args) {
		
		// Type 1 : Array Literal
		
		// Syntax : dataType variableName[]={values with same datatype};
		// [] --> represents the Array.
		
		int favNum[] = {9,21,4,5,33, -46,12};
		
		System.out.println(favNum);
		
		// Array index starts from 0.
		
//		System.out.println(favNum[10]);
		
		
		int length = favNum.length;
		 
		System.out.println("length "+length);
		
		System.out.println("Last value in the Array "+favNum[length-1]);
		
		
		
		for (int i = 0; i < favNum.length; i++) {
			System.out.println(favNum[i]);
		}
		
		
		int[] clone = favNum.clone();
		
		System.out.println("===============================================");
		
		
		// Type 2 : Array Instantiation
		
		// Syntax int[] variable = new int[size];
		
		int[] numbers = new int[5];
		
		numbers[4] = 23;
		System.out.println(numbers[4]);
		numbers[0]=1;
		numbers[3]=15;
		numbers[2]= 89;
		numbers[1]= 15;
//		numbers[5] = 6; --> can't able to access values out of index
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		Arrays.sort(numbers); // Sort the values based on Ascii Values.
		
		System.out.println("==================================");
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println("==============================");
		
		System.out.println("Smallest value in the Array : " + numbers[0]);
		
		System.out.println("Largest value in the Array : " + numbers[numbers.length-1]);
		
	}

}
