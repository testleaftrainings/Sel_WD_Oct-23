package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardActions {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/input.xhtml");
		Actions action = new Actions(driver);
		
		// press the key --> keyDown
		// relese the key --> keyUp
		
		WebElement clrValue = driver.findElement(By.name("j_idt88:j_idt95"));
		action.click(clrValue)
		.keyDown(Keys.SHIFT).keyDown(Keys.HOME)
		.keyUp(Keys.SHIFT).keyUp(Keys.HOME)
		.keyDown(Keys.BACK_SPACE).pause(5).keyUp(Keys.BACK_SPACE)
		.perform();
		
		action
		.keyDown(Keys.TAB).keyUp(Keys.TAB)
		.keyDown(Keys.TAB).keyUp(Keys.TAB)
		.sendKeys("gokul.sekar@testleaf.com")
		.keyDown(Keys.TAB).keyUp(Keys.TAB)
		.sendKeys("SDET")
		.perform();
	}

}
