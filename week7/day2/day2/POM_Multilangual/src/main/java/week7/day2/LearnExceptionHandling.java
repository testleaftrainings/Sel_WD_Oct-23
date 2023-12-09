package week7.day2;

import java.io.FileNotFoundException;

public class LearnExceptionHandling {

	public static void main(String[] args) {
		
		int a = 5;
		int b = 10;
		int c; 
		
		c = a+b ;
		System.out.println(c);
		
		try {
			c = a/0;
			System.out.println(c);
		}catch(Exception e) {
			System.out.println(a/1);
		}finally {
			System.out.println("This is finally");
		}
		
		
		int[] x= {1,2,3,4,5,6};
		
		try {
			System.out.println(x[6]);
		} catch (ArithmeticException e) {
			System.err.println(e);
			System.out.println("index zero default "+x[0]);
		}catch(RuntimeException e) {
			System.err.println(e);
			try {
				System.out.println("index 5 "+x[7]);
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				System.out.println("default index "+x[0]);
			}
		}catch(Exception e) {
			System.err.println(e);
			System.out.println("Unable to execute");
			throw new RuntimeException();
		}
		
		
	}

}
