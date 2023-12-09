package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class ViewLeadPage extends ProjectSpecificMethod {

	
	

	@Given ("Get the lead id")
	public void retriveLeadId() {
		String text = getDriver().findElement(By.id("viewLead_companyName_sp")).getText();
		System.out.println(text);
	}
	
	@Then ("Verify Create Lead is successfull")
	public void verifyCreateLead() {
		System.out.println(getDriver().getTitle());
	}
	
}
