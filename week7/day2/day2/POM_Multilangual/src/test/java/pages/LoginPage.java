package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class LoginPage extends ProjectSpecificMethod {
	
	
	

	@Given ("Enter the username")
	public LoginPage enterUsername() {
		System.out.println("LoginPage : " + getDriver());
		
		getDriver().findElement(By.id("username")).sendKeys(prop.get().getProperty("username"));
//		LoginPage lp  = new LoginPage();
//		return lp ;
		return this;
	}
	
	@Given ("Enter the password")
	public LoginPage enterPassword() {
		getDriver().findElement(By.id("password")).sendKeys((String) prop.get().get("password"));
//		LoginPage lp  = new LoginPage();
//		return lp ;
//		return new LoginPage();
		return this;
	}
	
	@When ("Click on the Login button")
	public WelcomePage clickLoginButton() {
		getDriver().findElement(By.className("decorativeSubmit")).click();
//		WelcomePage wp = new WelcomePage();
//		return wp;
		return new WelcomePage();
	}

}
