package week5.day2;

import org.testng.annotations.Test;

public class LearnDependsOnMethod {
	
	@Test(invocationCount = 2, invocationTimeOut = 1500)
	public void editLead() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("Edit Lead");
	}

	@Test(dependsOnMethods = "editLead", alwaysRun = true)
	public void createLead() {
		System.out.println("Create Lead");
	}
	
	@Test(dependsOnMethods ={"createLead","editLead"} )
	public void deleteLead() {
		System.out.println("Delete Lead");
	}
	
	
}
