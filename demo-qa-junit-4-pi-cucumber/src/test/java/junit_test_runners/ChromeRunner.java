package junit_test_runners;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import utilities.Configurations;

@RunWith(Categories.class)
@IncludeCategory(ChromeTest.class)
@SuiteClasses(Configurations.class)
public class ChromeRunner {

}
