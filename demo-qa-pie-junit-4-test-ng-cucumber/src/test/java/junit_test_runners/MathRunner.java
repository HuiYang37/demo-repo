package junit_test_runners;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import demo_junit_tests.DemoAppTest;
import junit_categories.Math;

@RunWith(Categories.class)
@IncludeCategory({ Math.class })
@SuiteClasses(value = { DemoAppTest.class })
public class MathRunner {

}
