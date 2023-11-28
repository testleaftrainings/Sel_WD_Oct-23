package runner;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src/test/java/features/week6day2.feature","src/test/java/features/week6day2MultipleData.feature"},
					glue ="stepDefinition",
					monochrome= true,
					publish = true)
public class Week6Day2Runner extends BaseClass {

}
