package cucumber.test_runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "./src/test/resources/features", glue = { "step_definitions",
		"cucumber.hooks.ui" }, plugin = { "pretty", "html:target/html-reports/cucumber.html",
				"json:target/json-reports/cucumber.json" }, dryRun = false, tags = "@hero")
public class MyTestRunner extends AbstractTestNGCucumberTests {

}
