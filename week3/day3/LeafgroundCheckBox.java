package week3.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafgroundCheckBox {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/checkbox.xhtml");
		WebElement basicChkBox = driver.findElement(By.xpath("//input[@aria-label='Basic']"));
		driver.executeScript("arguments[0].click();", basicChkBox);

	}

}
