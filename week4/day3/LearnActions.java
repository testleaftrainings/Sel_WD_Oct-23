package week4.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnActions {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://leafground.com/drag.xhtml");
		Actions action = new Actions(driver);
		
		WebElement firstColumn = driver.findElement(By.xpath("//th[@class='ui-state-default ui-draggable-column ui-draggable ui-draggable-handle ui-droppable']"));
		WebElement thirdColumn = driver.findElement(By.xpath("(//th[@class='ui-state-default ui-draggable-column ui-draggable ui-draggable-handle ui-droppable'])[3]"));
		action.clickAndHold(firstColumn).moveToElement(thirdColumn).release(firstColumn).perform();
		
		WebElement startRange = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		WebElement endRange = driver.findElement(By.xpath("(//span[@class='ui-slider-handle ui-corner-all ui-state-default'])[2]"));
		
		action.clickAndHold(startRange).moveByOffset(-50, 0).release(startRange).perform();
		action.clickAndHold(endRange).moveByOffset(20, 0).release(endRange).perform();

		
		// To set the zoom level --> 0.7 - 70% zoom level
		driver.executeScript("document.body.style.zoom='0.7'");
		
		WebElement blackWatch = driver.findElement(By.xpath("(//td[text()='Black Watch']/..)[2]"));
		WebElement bracelet = driver.findElement(By.xpath("(//td[text()='73'])[2]"));
		action.moveToElement(blackWatch).clickAndHold(blackWatch).moveToElement(bracelet).release(blackWatch).perform();
		
		
		/*driver.get("https://leafground.com/button.xhtml");
		
		WebElement sucessBtn = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-button-raised ui-button-success mr-2 mb-2']"));
		System.out.println(sucessBtn.getCssValue("background-color"));
		
		action.moveToElement(sucessBtn).perform();
		String sucessBtnClr = driver.findElement(By.xpath("//button[@class='ui-button ui-widget ui-state-default ui-corner-all ui-button-text-only ui-button-raised ui-button-success mr-2 mb-2']")).getCssValue("background-color");
		System.out.println(sucessBtnClr);
		System.out.println(sucessBtn.getCssValue("background-color"));*/
	}

}
