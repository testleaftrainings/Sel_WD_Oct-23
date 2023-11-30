package week6.day3;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnConstructor {
	// Constructor syntax  -> accessModifier sameClassName inputArgs{}
	
	// Default constructor
	public LearnConstructor() {
		System.out.println("This is default constructor");
	}
	
	// Parameterized Constructor
	public LearnConstructor(int x) {
		this("Testleaf");
		System.out.println("This is parametered Constructor " + x);
	}
	
	public LearnConstructor(String name) {
		this();
		System.out.println("Hello!!!" + name);
	}
	public void LearnConstructo() {
		System.out.println("This is normal method");
	}
	public static void main(String[] args) {
		/*
		 * ChromeOptions option = new ChromeOptions();
		 * option.addArguments("--disable-notifications");
		 * 
		 * ChromeDriver driver = new ChromeDriver(option);
		 */
		LearnConstructor lc = new LearnConstructor(5);
//		lc.LearnConstructo();
		
		
	}

}
