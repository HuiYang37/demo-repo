package junit.ui.tests.pom.gov.usa;

import org.junit.Assert;
import org.junit.Test;

import junit.ui.tests.pom.BaseTest;
import pages.usa.gov.HomePage;

public class GovHomePageTest extends BaseTest {

	private HomePage homePage;

	@Test
	public void navToAboutGovPageFromHomePageTest() {
		driver.get("https://www.usa.gov/");
		homePage = new HomePage(driver);
		homePage.clickOnAboutGovLink();
		Assert.assertTrue("Wrong page.", driver.getCurrentUrl().equals("https://www.usa.gov/about-the-us"));
	}

}
