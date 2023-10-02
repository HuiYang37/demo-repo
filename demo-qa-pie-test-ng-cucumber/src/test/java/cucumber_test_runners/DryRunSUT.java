package cucumber_test_runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "./src/test/resources/features", glue = "step_definitions", plugin = { "pretty",
		"html:target/html_reports/cucumber.html",
		"json:target/json_reports/cucumber.json" }, dryRun = true, tags = "@sut")
public class DryRunSUT extends AbstractTestNGCucumberTests {

}
