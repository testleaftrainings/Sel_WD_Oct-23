package week7.day1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Learnproperty {

	public static void main(String[] args) throws IOException {
		
		
		Properties prop = new Properties();
		
		FileInputStream file = new FileInputStream("./src/main/resources/credentials.properties");
		
		prop.load(file);
		
		String un = (String) prop.get("username");
		System.out.println("username " +un);
		Object pwd = prop.get("password");
		System.out.println("password " + pwd);
	}

}
