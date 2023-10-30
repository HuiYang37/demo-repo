package tests.ui.pom.com.usaa;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

import pages.usaa.com.HomePage;
import pages.usaa.com.LogOnPage;

public class HomePageTest extends TestConfig {

	HomePage homePage;
	LogOnPage logOnPage;

	@Test(groups = { "ui", "smoke" })
	public void goToLogOnPageAndBack() {
		homePage = new HomePage(driver);
		logOnPage = new LogOnPage(driver);
		// user is on the home page
		homePage.waitForPage();
		// user clicks on [Log On] link
		homePage.clickOnLogOn();
		// user is on the log on page
		logOnPage.waitForPage();
		assertTrue(logOnPage.getPageTitle().equals("Log On"));
		// user clicks on [Logo] link
		logOnPage.clickOnLogo();
		// user is back on the home page
		homePage.waitForPage();
		assertTrue(homePage.getCopyrightSubtitle().contains("USAA"));
	}

}
