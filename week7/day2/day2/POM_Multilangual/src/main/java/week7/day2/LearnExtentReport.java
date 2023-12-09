package week7.day2;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReport {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Starts");
		//Report path
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("reports/result.html");
		
		// create report
		ExtentReports extent = new ExtentReports();
		
		// Attach the report into the reporter path
		extent.attachReporter(reporter);
		
		ExtentTest test = extent.createTest("LoginTC", "Login functionality with Positive Crendential");
		
		test.pass("Username entered successfully");
		test.pass("password enter successfully", MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img1.png").build() );
		test.pass("Login button clicked successfully", MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img5.png").build());
		test.fail("Unable click crmsfa link", MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/img3.png").build());
		System.out.println("end");
	}

}
