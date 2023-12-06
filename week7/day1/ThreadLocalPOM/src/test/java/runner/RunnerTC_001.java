package runner;

import base.ProjectSpecificMethod;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features",
				 glue ="pages",
				 monochrome = true,
				 publish = true,
				 tags= "@createLead")
public class RunnerTC_001 extends ProjectSpecificMethod {

}
