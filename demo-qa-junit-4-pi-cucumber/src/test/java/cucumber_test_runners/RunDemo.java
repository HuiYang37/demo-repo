package cucumber_test_runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "./src/test/resources/features", glue = "step_definitions", plugin = { "pretty",
		"html:target/html_reports/index.html" }, tags = "@demo")
public class RunDemo {
}
