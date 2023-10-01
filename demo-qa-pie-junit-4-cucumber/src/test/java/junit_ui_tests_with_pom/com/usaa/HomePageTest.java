package junit_ui_tests_with_pom.com.usaa;

import org.junit.Assert;
import org.junit.Test;

import pages.usaa_pages.HomePage;
import pages.usaa_pages.LogOnPage;

public class HomePageTest extends BaseTest {

	HomePage homePage;
	LogOnPage logOnPage;

	@Test
	public void goToLogOnPageAndBack() {
		homePage = new HomePage(driver);
		logOnPage = new LogOnPage(driver);
		// user is on the home page
		homePage.waitForPage();
		// user clicks on [Log On] link
		homePage.clickOnLogOn();
		// user is on the log on page
		logOnPage.waitForPage();
		Assert.assertTrue(logOnPage.getPageTitle().equals("Log On"));
		// user clicks on [Logo] link
		logOnPage.clickOnLogo();
		// user is back on the home page
		homePage.waitForPage();
		Assert.assertTrue(homePage.getCopyrightSubtitle().contains("USAA"));
	}

}
