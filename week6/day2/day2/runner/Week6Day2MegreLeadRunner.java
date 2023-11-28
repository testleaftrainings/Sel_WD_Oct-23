package runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/week6day2.feature",
					glue ="stepDefinition",
					monochrome= true,
					publish = true)
public class Week6Day2MegreLeadRunner extends BaseClass {

}
