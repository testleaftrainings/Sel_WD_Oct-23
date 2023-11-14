package week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnWindowHandle {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
		driver.findElement(By.id("nav-search-submit-button")).click();
		System.out.println(driver);
		String parentWindow = driver.getWindowHandle();
		System.out.println("Current window address"+parentWindow);
		
		driver.findElement(By.xpath("//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal']")).click();
		
		
		Set<String> windowHandles = driver.getWindowHandles();
		
		List<String> window = new LinkedList<String>(windowHandles);
		
		for (String windowAdd : window) {
			driver.switchTo().window(windowAdd);
			
			System.out.println(driver.getTitle());
		}
		
		System.out.println("=======================================================");
		
		driver.switchTo().window(parentWindow);
		
		driver.findElement(By.xpath("(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[4]")).click();
		
		driver.findElement(By.xpath("(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[6]")).click();
		
		driver.findElement(By.xpath("(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[7]")).click();
		
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> window2 = new ArrayList<String>(windowHandles2);
		
		for (int i = 0; i < window2.size(); i++) {
			driver.switchTo().window(window2.get(i));
			System.out.println(driver.getTitle());
		}
		
		
		
		
	}

}
