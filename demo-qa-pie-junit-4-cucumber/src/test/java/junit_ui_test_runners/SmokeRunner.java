package junit_ui_test_runners;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import junit_categories.Smoke;
import junit_ui_tests_with_pom.com.usaa.HomePageTest;

@RunWith(Categories.class)
@IncludeCategory({ Smoke.class })
@SuiteClasses({ HomePageTest.class })
public class SmokeRunner {

}
