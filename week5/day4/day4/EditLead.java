package week5.day4;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class EditLead extends ProjectSpecificMethod {

	
	@Test(dataProvider="fetchData")
	public void runEditLead(String phNo, String cname) throws InterruptedException {
		
		
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phNo);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		WebElement compName = driver.findElement(By.id("updateLeadForm_companyName"));
		compName.clear();
		compName.sendKeys(cname);
		driver.findElement(By.name("submitButton")).click();
		
}
	@BeforeTest
	public void setData() {
		excelFileName = "EditLead";
	}
	
	
}






