package junit_ui_tests_with_pom.gov.usa;

import org.junit.Assert;
import org.junit.Test;

import pages.usa_gov_pages.HomePage;

public class GovHomePageTest extends BaseTest {

	private HomePage homePage;

	@Test
	public void navToAboutGovPageFromHomePageTest() {
		homePage = new HomePage(driver);
		homePage.clickOnAboutGovLink();
		Assert.assertTrue("Wrong page.", driver.getCurrentUrl().equals("https://www.usa.gov/about-the-us"));
	}

}
