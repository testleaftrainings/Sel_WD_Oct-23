package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.When;

public class MyHomePage extends ProjectSpecificMethod{
	
	

	@When ("Click on the Leads tab")
	public MyLeadsPage clickLeadsTab() {
		getDriver().findElement(By.linkText(prop.get().getProperty("leadsTab"))).click();
		return new MyLeadsPage();
	}

}
