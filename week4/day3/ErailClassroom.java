package week4.day3;

import java.time.Duration;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErailClassroom {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://erail.in/");
		WebElement from = driver.findElement(By.id("txtStationFrom"));
		from.clear();
		from.sendKeys("MAS"+Keys.ENTER);
		WebElement to = driver.findElement(By.id("txtStationTo"));
		to.clear();
		to.sendKeys("MDU"+Keys.ENTER);
		driver.findElement(By.id("chkSelectDateOnly")).click();
		
		List<WebElement> trainTable = driver.findElements(By.xpath("//table[contains(@class,'DataTable')]/tbody/tr/td[2]"));
		System.out.println("Column count  " + trainTable.size());
		Set<String> trainNames =new TreeSet<String>();
		for (int i = 2; i <=trainTable.size(); i++) {
			
			String trainName = driver.findElement(By.xpath("//table[contains(@class,'DataTable')]/tbody/tr["+i+"]/td[2]")).getText();
			trainNames.add(trainName);
			System.out.println("train "+i+" is " + trainName);
			
		}
		
		if((trainTable.size()-1) == trainNames.size()) {
			System.out.println("There is no duplicates");
		}else {
			System.out.println("There is duplicate in names");
		}
		
		driver.close();
		
	}

}
