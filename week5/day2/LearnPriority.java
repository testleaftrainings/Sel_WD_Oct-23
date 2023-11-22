package week5.day2;

import org.testng.annotations.Test;

public class LearnPriority {

	@Test(priority = 1, invocationCount = 5, invocationTimeOut = 8000, threadPoolSize = 2 )
	//1st execution = 1515, 2nd execution = 1504, 3rd = 1512, 4th = 1515 , 5th =1520 
	// 3016
	public void createLead() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("create Lead");
	}
	
	@Test(priority =2, threadPoolSize = 2)
	public void editLead() {
		System.out.println("edit Lead");
	}
	
	@Test(priority = 3 , enabled = false)
	public void deleteLead() {
		System.out.println("delete Lead");
	}
	
	@Test(priority = 4)
	public void duplicateLead() {
		System.out.println("duplicate Lead");
	}
	
	
}
