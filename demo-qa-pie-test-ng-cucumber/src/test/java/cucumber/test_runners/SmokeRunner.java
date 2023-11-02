package cucumber.test_runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "./src/test/resources/features", glue = { "step_definitions",
		"cucumber.hooks.ui" }, plugin = { "pretty", "html:target/html_reports/cucumber.html",
				"json:target/json_reports/cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, publish = true, dryRun = false, tags = "@smoke")
public class SmokeRunner extends AbstractTestNGCucumberTests {

}
