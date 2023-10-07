package cucumber_test_runners;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "./src/test/resources/features", glue = { "step_definitions", "cucumber_hooks.ui_hooks" }, plugin = {
		"pretty", "html:target/html_reports/cucumber.html",
		"json:target/json_reports/cucumber.json" }, dryRun = false, tags = "@ui")
public class ParallelRunner extends AbstractTestNGCucumberTests {

	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios() {
		return super.scenarios();
	}

}
