package pages;

import org.openqa.selenium.By;

import base.ProjectSpecificMethod;

public class WelcomePage extends ProjectSpecificMethod{

	public MyHomePage clickCrmsfaLink() {
		driver.findElement(By.linkText("CRM/SFA")).click();
		return new MyHomePage();
	}
	
	public LoginPage clickLogoutButton() {
		System.out.println("Logout successfull");
		return new LoginPage();
	}
	
	public WelcomePage verifyLoginPage() {
		System.out.println("Login Successfull");
//		WelcomePage wp = new WelcomePage();
//		return wp;
		return this;
	}
}
