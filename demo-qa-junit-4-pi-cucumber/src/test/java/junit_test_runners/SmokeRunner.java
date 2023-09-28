package junit_test_runners;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import junit_tests.DemoTest;
import junit_tests.MathTest;

@RunWith(Categories.class)
@IncludeCategory(SmokeTest.class)
@SuiteClasses({ DemoTest.class, MathTest.class })
public class SmokeRunner {

}
