package runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",
					glue ="stepDefinition",
					monochrome= true,
					publish = true,
					tags = "@createLead or @mergeLead")
public class Week6Day2Runner2 extends BaseClass {

}
