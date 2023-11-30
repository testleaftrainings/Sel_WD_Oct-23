package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;
import pages.WelcomePage;

public class LoginTC_001 extends ProjectSpecificMethod{
	
	
	@Test
	public void runLogin() {
		/*LoginPage lp = new LoginPage();
		lp.enterUsername();
		lp.enterPassword();
		lp.clickLoginButton();
		WelcomePage wp = new WelcomePage();
		wp.clickCrmsfaLink(); */
		
		LoginPage lp = new LoginPage();
		lp.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.verifyLoginPage()
		.clickCrmsfaLink();
		
	}

}
