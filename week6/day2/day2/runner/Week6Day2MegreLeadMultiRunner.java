package runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features/week6day2MultipleData.feature",
					glue ="stepDefinition",
					monochrome= true,
					publish = true)
public class Week6Day2MegreLeadMultiRunner extends BaseClass {

}
