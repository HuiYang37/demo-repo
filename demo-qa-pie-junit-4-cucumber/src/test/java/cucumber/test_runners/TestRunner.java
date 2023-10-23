package cucumber.test_runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/resources/features", glue = { "step_definitions",
		"cucumber.hooks.ui" }, plugin = { "pretty", "html:target/html_reports/cucumber.html",
				"json:target/json_reports/cucumber.json" }, dryRun = false, tags = "@smoke")
public class TestRunner {

}
