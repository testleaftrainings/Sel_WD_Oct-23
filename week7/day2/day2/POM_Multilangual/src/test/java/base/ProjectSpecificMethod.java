 package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.cucumber.testng.AbstractTestNGCucumberTests;

public class ProjectSpecificMethod extends AbstractTestNGCucumberTests{
//public static RemoteWebDriver driver;
//	public static Properties prop;

	private static final ThreadLocal<RemoteWebDriver> rd = new ThreadLocal<RemoteWebDriver>();
	
	protected static final ThreadLocal<Properties> prop = new ThreadLocal<Properties>();
	public void setDriver() {
		rd.set(new ChromeDriver());
	}
	
	public RemoteWebDriver getDriver() {
	
		return rd.get();
	}
	
//	public void setProperty() {
//		prop.set(new Properties());
//	}
//	
//	public Properties getProperty() {
//		return prop.get();
//	}

	
	@Parameters({"propFileName"})
	@BeforeMethod
	public void preCondition(String PropfileName) throws IOException {
//		driver = new ChromeDriver();
//		prop = new Properties();
		prop.set(new Properties());
		FileInputStream file = new FileInputStream("./src/test/resources/"+PropfileName+".properties");
//		prop.load(file);
		prop.get().load(file);
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
