package stepDefinition;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import io.cucumber.java.en.When;
import runner.BaseClass;

public class MergeLead extends BaseClass{

	@When ("Click on the merge leads")
	public void clickMergeLead() {
		driver.findElement(By.linkText("Merge Leads")).click();
	}
	
	@When ("Click on the from lead")
	public void clickFromLead() {
		driver.findElement(By.xpath("//a[contains(@href,'partyIdFrom')]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> window = new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(1));
	}
	
	@When("Click on the to lead")
	public void clickToLead() {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> window = new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(0));
		
		driver.findElement(By.xpath("//a[contains(@href,'partyIdTo')]")).click();
		windowHandles = driver.getWindowHandles();
		window = new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(1));
	}
	
	
	@When ("Click on merge button")
	public void clickMergeButton() {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> window = new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(0));
		driver.findElement(By.linkText("Merge")).click();
		Alert alert = driver.switchTo().alert();
		alert.accept();
	}
}
