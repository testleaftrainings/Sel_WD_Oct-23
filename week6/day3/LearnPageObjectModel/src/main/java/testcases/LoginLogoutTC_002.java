package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class LoginLogoutTC_002 extends ProjectSpecificMethod{

	
	@Test
	public void runLogout() {
		/*
		 * LoginPage lp = new LoginPage(); lp.enterUsername() .enterPassword()
		 */
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickLogoutButton();
		
	}
	
}
