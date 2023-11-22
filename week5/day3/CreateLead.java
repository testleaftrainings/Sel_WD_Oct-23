package week5.day3;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class CreateLead extends ProjectSpecificMethod {

	
	@Test(dataProvider="fetchData")
	public void runCreateLead(String cname, String fname, String lname,String phno ) {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lname);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(phno);
		driver.findElement(By.name("submitButton")).click();
}
	
	@DataProvider(name="fetchData", indices = {2,1})
	public String[][] setData() {
		String[][] data = new String[3][4];
		data[0][0] = "Testleaf";
		data[0][1] = "Hari";
		data[0][2] ="R";
		data[0][3] = "99";
		
		data[1][0] = "Testleaf";
		data[1][1] = "Babu";
		data[1][2] = "M";
		data[1][3] = "98";
		
		data[2][0] = "Testleaf";
		data[2][1] = "Gokul";
		data[2][2] = "S";
		data[2][3] = "97";
		
		return data;
	}
	
	
}






