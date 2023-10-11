package ui_tests.pom.gov.usa;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

import pages.usa_gov_pages.HomePage;

public class GovHomePageTest extends TestConfig {

	private HomePage homePage;

	@Test
	public void navToAboutGovPageFromHomePageTest() {
		homePage = new HomePage(driver);
		homePage.clickOnAboutGovLink();
		assertTrue(driver.getCurrentUrl().equals("https://www.usa.gov/about-the-us"), "Wrong page.");
	}

}
