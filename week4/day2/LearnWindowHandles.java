package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandles {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.snapdeal.com/");
		
		driver.findElement(By.xpath("(//a[@class='product-card dp-widget-link'])[5]")).click();
		
		driver.findElement(By.xpath("(//a[@class='product-card dp-widget-link'])[6]")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> window = new ArrayList<String>(windowHandles);
		
		/*
		 * for (String string : windowHandles) { driver.switchTo().window(string);
		 * System.out.println(driver.getTitle()); }
		 */
		
		for (int i = 0; i < window.size(); i++) {
			driver.switchTo().window(window.get(i));
			System.out.println(driver.getTitle());
		}
		
	}

}
