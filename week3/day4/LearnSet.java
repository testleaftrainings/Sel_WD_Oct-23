package week3.day4;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		// Hash set --> sorting --> Hashing algorthom (random order)
		Set<String> names1 = new HashSet<String>();
		
		names1.add("Aishwarya");
		names1.add("Akhat");
		names1.add("Sarath");
		names1.add("Godwin");
		names1.add("Balaji");
		names1.add("Sedhu");
		names1.add("Aishwarya");
		names1.add("Akhat");
		names1.add("Sarath");
		names1.add("Godwin");
		names1.add("Balaji");
		names1.add("Sedhu");

		
		System.out.println("By using Hash set :" +names1);
		
		
		// Linked Hast Set --> sort --> Insertion order
		Set<String> names2 = new LinkedHashSet<String>();
		names2.add("Aishwarya");
		names2.add("Akhat");
		names2.add("Sarath");
		names2.add("Godwin");
		names2.add("Balaji");
		names2.add("Sedhu");
		names2.add("Aishwarya");
		names2.add("Akhat");
		names2.add("Sarath");
		names2.add("Godwin");
		names2.add("Balaji");
		names2.add("Sedhu");
		
		System.out.println("By using Linked Hash set :" +names2);
		
		// Tree set --> sort --> Ascii values
		Set<String> names3 = new TreeSet<String>();
		names3.add("Aishwarya");
		names3.add("akhat");
		names3.add("Sarath");
		names3.add("Godwin");
		names3.add("Balaji");
		names3.add("sedhu");
		names3.add("Aishwarya");
		names3.add("Akhat");
		names3.add("Sarath");
		names3.add("Godwin");
		names3.add("Balaji");
		names3.add("Sedhu");
		
		System.out.println("By using Tree set :" +names3);
		
		names1.addAll(names3);
		System.out.println(names1);
		
		// Convert set into list
		List<String> names4 = new LinkedList<String>(names2);
		names4.addAll(names3);
		System.out.println("List : " + names4);
		
		
		names3.clear();
		System.out.println("names3 : " + names3);
		
		names3.addAll(names4);
		System.out.println("names3 : " + names3);
		
		names3.remove("Gokul");
		
		
		//for each --> to iterate all the values 
		for (String string : names3) {
			System.out.println(string);
		}
		
		// Syntax for(dataType localVariableName : variableName/Collections/WebElements){}
		
		int[] num = {2,4,6,8,1,4,1};
		for(int number : num) {
//			System.out.println(number);
			if(number%2==0) {
				System.out.println(number);
			}
		}
		
	}

}
