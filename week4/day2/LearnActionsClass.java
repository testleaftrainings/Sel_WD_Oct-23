package week4.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActionsClass {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://www.snapdeal.com/");
		
		Actions action = new Actions(driver);
		
//		WebElement mensFashion = driver.findElement(By.xpath("//span[@class='catText']"));
//		action.moveToElement(mensFashion).perform();
//		Thread.sleep(5000);
//		
//		WebElement snapDealBusiness = driver.findElement(By.xpath("//div[text()='Snapdeal Business']"));
//		
//		action.scrollToElement(snapDealBusiness).perform();
//		Thread.sleep(5000);
//		
//		action.moveToElement(snapDealBusiness).perform();
//		Thread.sleep(5000);
//		
//		action.scrollByAmount(0, 400).perform();
//		Thread.sleep(5000);
//		action.scrollByAmount(0, -800).perform();
//		Thread.sleep(5000);
		
		driver.get("https://leafground.com/drag.xhtml");
		
		Thread.sleep(5000);
		WebElement dragAndDrop = driver.findElement(By.id("form:conpnl"));
		
		action.dragAndDropBy(dragAndDrop, 200, 0).perform();
		Thread.sleep(5000);
		action.dragAndDropBy(dragAndDrop, -100, 0).perform();
		Thread.sleep(5000);
		
		WebElement drop = driver.findElement(By.id("form:drop"));
		WebElement drag = driver.findElement(By.id("form:drag_content"));
		
		action.dragAndDrop(drag, drop).perform();
		Thread.sleep(5000);
		
//		driver.close();
		

	}

}
