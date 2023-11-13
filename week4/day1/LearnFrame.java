package week4.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFrame {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/frame.xhtml");
		// switch to frame using index
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		
		
		// switch back to main web page
		driver.switchTo().defaultContent();
		
		String text = driver.findElement(By.xpath("//h5[text()=' Click Me (Inside frame)']")).getText();
		System.out.println(text);
		
		List<WebElement> frame = driver.findElements(By.tagName("iframe"));
		System.out.println(frame.size());
		
		WebElement nestedFrame = driver.findElement(By.xpath("//h5[text()=' Click Me (Inside Nested frame)']/following-sibling::iframe"));
		// Switch to frame using webElement
		driver.switchTo().frame(nestedFrame);
		
		//switch to frame using id/name attribute
		driver.switchTo().frame("frame2");
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		
		// switch to parent frame --> one frame outside
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		String text1 = driver.findElement(By.xpath("//h5[text()=' Click Me (Inside frame)']")).getText();
		System.out.println(text1);
		
		
		
		
	}

}
