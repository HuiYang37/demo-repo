package cucumber.test_runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "./src/test/resources/features", glue = { "step_definitions",
		"cucumber.hooks.ui" }, plugin = { "pretty", "html:target/html-reports/cucumber.html",
				"json:target/json-reports/cucumber.json",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }, publish = true, dryRun = false, tags = "@ui")
public class ParallelRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

}
