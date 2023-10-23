package junit.ui.tests.pom.com.usaa;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import junit.categories.Smoke;
import junit.ui.tests.pom.BaseTest;
import pages.usaa.HomePage;
import pages.usaa.LogOnPage;

public class HomePageTest extends BaseTest {

	HomePage homePage;
	LogOnPage logOnPage;

	@Test
	@Category(Smoke.class)
	public void goToLogOnPageAndBack() {
		driver.get("https://www.usaa.com/");
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
