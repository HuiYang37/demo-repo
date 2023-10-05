package step_definitions;

import static org.testng.Assert.*;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import pages.demo_pages.InventoryPage;
import pages.demo_pages.LoginPage;
import utilities.ConfigReader;
import utilities.DriverFactory;
import utilities.SeleniumService;

public class DemoLoginSteps {

	WebDriver driver = DriverFactory.getDriver();
	SeleniumService ss = new SeleniumService();
	LoginPage loginPage = new LoginPage(driver);
	InventoryPage inventoryPage = new InventoryPage(driver);

	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
		driver.get("https://www.saucedemo.com/");
		loginPage.waitForPage();
	}

	@When("user enters username and password")
	public void user_enters_username_and_password(DataTable dt) {
		Map<String, String> data = dt.asMap();
		String username = data.get("username");
		String password = data.get("password");
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
	}

	@When("user clicks on [Login] button")
	public void user_clicks_on_login_button() {
		if (ConfigReader.isDemo())
			ss.pause(ConfigReader.getDemoWaitTime());
		loginPage.clickOnLogin();
	}

	@Then("user is on the inventory page")
	public void user_is_on_the_inventory_page() {
		inventoryPage.waitForPage();
	}

	@Then("users sees the error message")
	public void users_sees_the_error_message(DataTable dt) {
		Map<String, String> data = dt.asMap();
		String expectedErrorText = data.get("error");
		assertEquals(loginPage.getErrorText(), expectedErrorText);
	}

}
