package week4.day4;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnWaits {

	public static void main(String[] args) throws IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/waits.xhtml");
		
		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath("//span[text()='Click']")).click();
//		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//span[text()='I am here']")));
		boolean displayed = driver.findElement(By.xpath("//span[text()='I am here']")).isDisplayed();
		System.out.println("enabled : " + displayed);
		
		driver.findElement(By.xpath("(//span[text()='Click'])[2]")).click();
		WebElement hideEle = driver.findElement(By.xpath("//span[text()='I am about to hide']"));
		Boolean until = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='I am about to hide']")));
		System.out.println(until);
//		System.out.println(hideEle.isDisplayed());
		
		driver.findElement(By.xpath("//span[text()='Click First Button']")).click();
			
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//span[text()='Message 1']")));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='Click Second']")));
		WebElement secondEle = driver.findElement(By.xpath("//span[text()='Click Second']"));
//		driver.executeScript("arguments[0].click();", secondEle);
		secondEle.click();
		// Take snap 
		File screenShot1 = driver.getScreenshotAs(OutputType.FILE);
		// Where to store the screen Shot --> Location
		File location1 = new File("./snaps/beforeClick.png");
		//Move the screen shot to the location
		FileUtils.copyFile(screenShot1, location1);
		
		driver.findElement(By.xpath("(//span[text()='Click'])[3]")).click();
		wait.until(ExpectedConditions.textToBe(By.xpath("(//h5[text()='Wait for Text Change (1 - 10 Sec)']/following::span[@class='ui-button-text ui-c'])[2]"), "Did you notice?"));
		
		
		File screenShot2 = driver.getScreenshotAs(OutputType.FILE);
		// Where to store the screen Shot --> Location
		File location2 = new File("./snaps/afterClick.png");
		//Move the screen shot to the location
		FileUtils.copyFile(screenShot2, location2);
		
		WebElement lastWait = driver.findElement(By.xpath("//h5[text()='Wait for Text Change (1 - 10 Sec)']/.."));
		File eleSS = lastWait.getScreenshotAs(OutputType.FILE);
		File elePath = new File("./snaps/elesnap.png");
		FileUtils.copyFile(eleSS, elePath);
		
		driver.get("https://leafground.com/window.xhtml");
		
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		
		wait.until(ExpectedConditions.numberOfWindowsToBe(3));
		
		driver.quit();
	}

}
