package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.When;

public class MyLeadsPage extends ProjectSpecificMethod{

	

	@When ("Click on the Create Lead")
	public CreateLeadPage clickCreateLead() {
		
		getDriver().findElement(By.linkText((String) prop.get().get("createLead"))).click();
		return new CreateLeadPage();		
	}
}
