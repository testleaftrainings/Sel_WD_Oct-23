package week4.day3;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWebTable {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/table.xhtml");
		
		List<WebElement> table = driver.findElements(By.xpath("(//table)[5]/thead/tr/th"));
		int tableSize = table.size();
		System.out.println("Table size :  " + tableSize);
		
		for (int i = 1; i <= tableSize ; i++) {
			String text = driver.findElement(By.xpath("(//table)[5]/thead/tr/th["+i+"]")).getText();
			System.out.println("header " +i +" is " + text);
		}
		
		System.out.println("==================================================================");
		List<WebElement> tableCol = driver.findElements(By.xpath("(//table)[6]/tbody/tr/td[1]"));
		int colSize = tableCol.size();
		System.out.println("No of coloums in the table " + colSize);
		Set<String>name = new TreeSet<String>();
		for (int i = 1; i <= colSize; i++) {
			String text = driver.findElement(By.xpath("(//table)[6]/tbody/tr["+i+"]/td[1]")).getText();
			System.out.println("Name " +i+ " is " + text);
			name.add(text);
		}
		
		if(colSize == name.size()) {
			System.out.println("There is no duplicates");
		}else {
			System.out.println("There is duplicate in names");
		}
		
		System.out.println("=========================================================================");
		//(//table)[6]/tbody/tr[2]/td[4]
		
		for (int i = 1; i <= colSize; i++) {
			String text = driver.findElement(By.xpath("(//table)[6]/tbody/tr["+i+"]/td[4]")).getText();
			System.out.println("Joining " +i+ " is " + text);
		}

	}

}
