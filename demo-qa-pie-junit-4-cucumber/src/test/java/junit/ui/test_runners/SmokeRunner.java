package junit.ui.test_runners;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import junit.categories.Smoke;
import junit.ui.tests.pom.com.usaa.HomePageTest;

@RunWith(Categories.class)
@IncludeCategory({ Smoke.class })
@SuiteClasses({ HomePageTest.class })
public class SmokeRunner {

}
