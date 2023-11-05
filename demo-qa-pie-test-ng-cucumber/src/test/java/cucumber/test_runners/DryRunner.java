package cucumber.test_runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "./src/test/resources/features", glue = "step_definitions", plugin = {
		"pretty" }, dryRun = true, tags = "@dry")
public class DryRunner extends AbstractTestNGCucumberTests {

}
