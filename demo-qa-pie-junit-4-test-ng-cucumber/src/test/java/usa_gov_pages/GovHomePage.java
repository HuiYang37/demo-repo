package usa_gov_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GovHomePage {

	@FindBy(xpath = "//li[@id='usa-nav__topics']/a")
	WebElement allTopicsLink;

	@FindBy(xpath = "//li[@id='usa-nav__about']/a")
	WebElement aboutGovLink;

	@FindBy(xpath = "//li[@id='usa-nav_benefits']/a")
	WebElement benefitsLink;

	@FindBy(xpath = "//li[@id='usa-nav_housing']/a")
	WebElement housingHelpLink;

	@FindBy(xpath = "//li[@id='usa-nav__scams']/a")
	WebElement scamsLink;

	@FindBy(xpath = "//li[@id='usa-nav_taxes']/a")
	WebElement taxesLink;

	@FindBy(xpath = "//li[@id='usa-nav_travel']/a")
	WebElement travelLink;

}
