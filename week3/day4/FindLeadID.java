package week3.day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindLeadID {

	public static void main(String[] args) throws InterruptedException {
		
		// Launch the browser
				ChromeDriver driver = new ChromeDriver();
				
				// Load the url
				driver.get("http://leaftaps.com/opentaps/");
				
				//Maximize the window
				driver.manage().window().maximize();
				
				//Enter the username
				driver.findElement(By.className("inputLogin")).sendKeys("Demosalesmanager");
				
				//wait
				Thread.sleep(2000);
				
				//Enter the password
				driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
				
				//Click Login
				driver.findElement(By.className("decorativeSubmit")).click();
				
				//Verify the title
				String title = driver.getTitle();
				//System.out.println(title);
				if(title.contains("TestLeaf")) {
					System.out.println("Leaftaps Login successfully");
				}else {
					System.out.println("Login failed");
				}
				
				
				//Click CRM/SFA
				WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
				crmsfa.click();
				
				//Click Leads tab
				WebElement leadsTab = driver.findElement(By.linkText("Leads"));
				leadsTab.click();
				
				// Click Find Leads
				driver.findElement(By.linkText("Find Leads")).click();
				
				// Find all lead id
				List<WebElement> leadIDs = driver.findElements(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a"));
				
				for (int i = 0; i < leadIDs.size(); i++) {
					
					WebElement webElement = leadIDs.get(i);
					
					System.out.println(webElement.getText());
					
				}

	}

}
