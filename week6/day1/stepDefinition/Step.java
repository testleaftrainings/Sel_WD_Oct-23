package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import runner.BaseClass;
import runner.Hooks;

public class Step extends BaseClass {

	/*public  RemoteWebDriver driver;
	
	@Given("Launch the browser")
	public void launch_the_browser() {
	    driver = new ChromeDriver();
	}

	@Given("Load the url")
	public void load_the_url() {
	    driver.get("http://leaftaps.com/opentaps/");
	} */

	@Given("Enter the username as {string}")
	public void enter_the_username(String uname) {
	    driver.findElement(By.id("username")).sendKeys(uname);
	}

	@Given("Enter the password")
	public void enter_the_password() {
		driver.findElement(By.id("password")).sendKeys("crmsfa");
	}

	@When("Click on the Login button")
	public void click_on_the_login_button() {
		driver.findElement(By.className("decorativeSubmit")).click();
	}

	@Then("Verify login is successfull")
	public void verify_login_is_successfull() {
	   String title = driver.getTitle();
	   if(title.contains("Leaftaps")) {
		   System.out.println("Title is verified");
	   }
	}
	
	
	@When ("Click on the crmsfa")
	public void clickCrmsfa() {
		driver.findElement(By.linkText("CRM/SFA")).click();
	}
	@When ("Click on the Leads tab")
	public void clickLeads() {
		driver.findElement(By.linkText("Leads")).click();
	}
	@When ("Click on the Create Lead")
	public void clickCreateLead() {
		driver.findElement(By.linkText("Create Lead")).click();
	}
	@Given ("Enter the company name")
	public void enterCname() {
		WebElement companyName = driver.findElement(By.id("createLeadForm_companyName"));
		companyName.sendKeys("Testleaf");
	}
	@Given ("Enter the first name")
	public void enterFname() {
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Gokul");
	}
	@Given ("Enter the last name")
	public void enterLname() {
		WebElement lastName = driver.findElement(By.id("createLeadForm_lastName"));
		lastName.sendKeys("Sekar");
	}
	@When ("Click on the submit button")
	public void clickSubmit() {
		WebElement createLeadButton = driver.findElement(By.className("smallSubmit"));
		createLeadButton.click();
	}
	@Then ("Verify Create Lead is successfull")
	public void verifyCreateLead() {
		String leadPage = driver.findElement(By.tagName("title")).getText();
		if(leadPage.contains("View Lead")) {
			System.out.println("Lead create successfully");
		}else {
			System.out.println("Lead is not create Lead");
		}
	}
	@Given ("Get the lead id")
	public void getLeadId() {
		String leadId_Cname = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		String leadId = leadId_Cname.replaceAll("[^0-9]", "");
		
		System.out.println("leadId_Cname : " +leadId_Cname);
		System.out.println("leadId : " +leadId);
	}
	
	/*@When ("Close the browser")
	public void closeBrowser() {
		driver.close();
	}*/
	
	@Given ("Enter the uname")
	public void enterUName() {
		driver.findElement(By.id("username")).sendKeys("demomanager");
	}
	
	@When ("Click on the find leads")
	public  void clickFindLeads() {
		
	}
	@Given ("Enter the firstName")
	public  void enterfname() {
		
	}
	@When ("Click on the find leads button")
	public  void clickFindLeadsButton() {
		
	}
	@When ("Click on the first resulting lead id")
	public  void clickFirstLeadID() {
		
	}
	@When ("Click on the edit button")
	public  void clickEditButton() {
		
	}
	@Given ("update the cname")
	public  void updateCname() {
		
	}
	@When ("click on the update button")
	public  void clickUpdateButton() {
		
	}
	
}
