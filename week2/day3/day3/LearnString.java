package week2.day3;

public class LearnString {

	public static void main(String[] args) {
		
		String input = "          Welcome to Testleaf                    ";
		
		String lastWord = input.substring(8);
		System.out.println("lastWord : " + lastWord);
		
		String firstWord = input.substring(0, 9);
		System.out.println("firstWord : " + firstWord);
		
		
		// To remove white space before/after text
		String trim = input.trim();
		System.out.println(trim);
		
		String rupee = "$1256 .,!axfshj/";
		String rupees = rupee.replaceAll("[^0-9]","");
		System.out.println(rupees);

		int parseInt = Integer.parseInt(rupees);
		System.out.println("parseInt : " +parseInt);
		
		int num = 1256;
		if(num==parseInt) {
			System.out.println("BOth are same");
		}
		
		
		// ctrl+2 , l		
		String string = Integer.toString(parseInt);
		System.out.println("string : " + string);
		
		
	}

}
