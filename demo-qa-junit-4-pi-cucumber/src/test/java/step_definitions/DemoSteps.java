package step_definitions;

import io.cucumber.java.en.*;

public class DemoSteps {

	@Given("this is a demo")
	public void this_is_a_demo() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("This is a demo.");
	}

	@When("user runs this file")
	public void user_runs_this_file() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("File running...");
	}

	@Then("user sees a custom demo message")
	public void user_sees_a_custom_demo_message() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("This is the end.");
	}

}
