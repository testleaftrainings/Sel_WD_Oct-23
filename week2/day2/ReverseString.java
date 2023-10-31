package week2.day2;

public class ReverseString {

	public static void main(String[] args) {
		

		String name = "Testleaf";// faeltseT
		
//		char[] charArray = name.toCharArray();
		
		for(int i=name.length()-1; i>=0; i-- ) {
			
			System.out.print(name.charAt(i));
			
		}
		
		System.out.println("\n"+name.charAt(5));
		
		
		String[] split = name.split("est");
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
		}
		
		
		String lowerCase = name.toLowerCase();
		System.out.println("lowerCase : " +lowerCase);
		
		
		String upperCase = name.toUpperCase();
		System.out.println("upperCase : " +upperCase);
		
		String replace = name.replace("e", "l");
		System.out.println("replace : " +replace);
		
		
		String replaceFirst = name.replaceFirst("Te", "teee");
		
		System.out.println("replaceFirst : " +replaceFirst);
		
		String text = "Hello123!$";
		String numbers = text.replaceAll("[^0-9]", "");
		System.out.println("numbers : " +numbers);
		
		String withoutNumbers = text.replaceAll("[0-9]", "");
		System.out.println("withoutNumbers : " +withoutNumbers);
		
		String onlyWords = text.replaceAll("[13]", "");
		System.out.println("onlyWords : "+onlyWords);
		
		
		
		
		
	}
}
