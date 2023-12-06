package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethod;
import pages.LoginPage;

public class CreateLeadTC_003 extends ProjectSpecificMethod {

	
	@Test
	public void runCreateLead() {
		
		new LoginPage()
		.enterUsername()
		.enterPassword()
		.clickLoginButton()
		.clickCrmsfaLink()
		.clickLeadsTab()
		.clickCreateLead()
		.enterCompanyName()
		.enterFirstName()
		.enterLastName()
		.enterPhno()
		.clickSubmitButton();
	}
	
}
