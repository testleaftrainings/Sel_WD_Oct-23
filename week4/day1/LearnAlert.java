package week4.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnAlert {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/alert.xhtml");
		
		
		// Simple alert
		driver.findElement(By.xpath("//span[text()='Show']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.println(text);
		alert.accept();
		
		
		// Confirmation alert
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
//		alert.sendKeys("Gokul");
		alert.dismiss();
		
		
		// prompt alert
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		alert.sendKeys("Gokul");
		alert.accept();
		
		
		// Sweet alert
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		
//		driver.findElement(By.xpath("(//span[text()='Show'])[4]")).click();
	}

}
