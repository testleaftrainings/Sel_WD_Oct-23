package runner;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.testng.AbstractTestNGCucumberTests;

public class Hooks  extends AbstractTestNGCucumberTests {
public RemoteWebDriver driver;
	@Before
	public void preCondition() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
	}
	
	@After
	public void postCondition() {
		driver.close();
	}
	
}
