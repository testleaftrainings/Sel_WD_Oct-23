 package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class ProjectSpecificMethod extends AbstractTestNGCucumberTests{
//public static RemoteWebDriver driver;
	public static Properties prop;

	private static final ThreadLocal<RemoteWebDriver> rd = new ThreadLocal<RemoteWebDriver>();
	
	public void setDriver() {
		rd.set(new ChromeDriver());
	}
	
	public RemoteWebDriver getDriver() {
	
		return rd.get();
	}

	@BeforeMethod
	public void preCondition() throws IOException {
//		driver = new ChromeDriver();
		prop = new Properties();
		FileInputStream file = new FileInputStream("./src/main/resources/credentials.properties");
		prop.load(file);
		
		setDriver();
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		getDriver().get("http://leaftaps.com/opentaps/");
		
	}
	
	@AfterMethod
	public void postCondition() {
		getDriver().close();
	}
	
}
