package week3.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {
		//  <> -- Generic
//Interface <WrapperClass> listName/variableName = new ImplementationClass<WrapperClass>();
		
		//ArrayList --> it will be able to access fast 
		// LinkedList --> it will be able to assign dynamic value (index position) faster.
		
		List <String> mentors = new ArrayList<String>();
		mentors.add("Babu");
		mentors.add("Hari");
		mentors.add("ssp");
		mentors.add("sudharsan");
		
		System.out.println(mentors);
		
		mentors.add("Vidya");
		mentors.add("Princila");
		mentors.add("Subraja");
		mentors.add("Dilip");
		mentors.add("Ranjini");

		System.out.println(mentors);
		
		String index0 = mentors.get(0);
		System.out.println(index0);
		System.out.println(mentors.get(4));
		int mentorsSize = mentors.size();
		System.out.println("Mentors Size : " + mentorsSize);
		
		mentors.add(4, "Gokul");
		System.out.println(mentors);
		mentors.add(4, "Ragu");
		mentors.add("Gokul");
		System.out.println(mentors);
		
		
		List <String> seniorCoach = new LinkedList<String>();
		seniorCoach.addAll(mentors);
		System.out.println("seniorCoach");
		System.out.println(seniorCoach);
		seniorCoach.remove("Ranjini");
		System.out.println(seniorCoach);
		seniorCoach.remove(10);
		System.out.println(seniorCoach);
		seniorCoach.remove("Ranjini");
		System.out.println("seniorCoach : " +seniorCoach);
		
		System.out.println("================");
		
		List <String> trainers = new ArrayList<String>();
		trainers.add("Vidya");
		trainers.add("Princila");
		trainers.add("Subraja");
		trainers.add("Dilip");
		trainers.add("Ranjini");
		
		seniorCoach.removeAll(trainers);
		System.out.println("seniorCoach : " +seniorCoach);
		System.out.println("trainers : " +trainers);
		
		
		
		
		
		/*
		 * int size = seniorCoach.size(); for (int i = 0; i <size; i++) {
		 * seniorCoach.remove(0); }
		 */
		seniorCoach.clear();
		System.out.println("seniorCoach : " +seniorCoach);
		
		Collections.sort(trainers);
		System.out.println("trainers : " +trainers);
		
	}

}
