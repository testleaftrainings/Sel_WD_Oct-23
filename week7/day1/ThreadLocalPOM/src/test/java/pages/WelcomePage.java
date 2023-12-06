package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.RemoteWebDriver;

import base.ProjectSpecificMethod;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WelcomePage extends ProjectSpecificMethod{

	

	@When ("Click on the crmsfa")
	public MyHomePage clickCrmsfaLink() {
		getDriver().findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}
	
	public LoginPage clickLogoutButton() {
		System.out.println("Logout successfull");
		return new LoginPage();
	}
	
	@Then ("Verify login is successfull")
	public void verifyLogin() {
		System.out.println(getDriver().getTitle());
	}
	
	public WelcomePage verifyLoginPage() {
		System.out.println("Login Successfull");
//		WelcomePage wp = new WelcomePage();
//		return wp;
		return this;
	}
}
