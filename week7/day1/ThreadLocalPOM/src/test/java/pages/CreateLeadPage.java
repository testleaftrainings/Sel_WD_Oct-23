package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class CreateLeadPage extends ProjectSpecificMethod{

	

	@Given ("Enter the company name")
	public CreateLeadPage enterCompanyName() {
		getDriver().findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		return this;
	}
	
	@Given ("Enter the first name")
	public CreateLeadPage enterFirstName() {
		getDriver().findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		return this;
	}
	
	@Given("Enter the last name")
	public CreateLeadPage enterLastName() {
		getDriver().findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		return this;
	}
	
	@Given ("Enter the phno")
	public CreateLeadPage enterPhno() {
		getDriver().findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("99");
		return this;
	}
	
	@When ("Click on the submit button")
	public ViewLeadPage clickSubmitButton() {
		getDriver().findElement(By.name("submitButton")).click();
		return new ViewLeadPage();
	}
}
