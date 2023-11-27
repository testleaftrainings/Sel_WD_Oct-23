package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Step {

	public  RemoteWebDriver driver;
	
	@Given("Launch the browser")
	public void launch_the_browser() {
	    driver = new ChromeDriver();
	}

	@Given("Load the url")
	public void load_the_url() {
	    driver.get("http://leaftaps.com/opentaps/");
	} 

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
	
	
	
	}
	
}
