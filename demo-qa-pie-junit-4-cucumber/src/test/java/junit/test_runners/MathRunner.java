package junit.test_runners;

import org.junit.experimental.categories.Categories;
import org.junit.experimental.categories.Categories.IncludeCategory;
import org.junit.runner.RunWith;
import org.junit.runners.Suite.SuiteClasses;

import junit.categories.Math;
import junit.tests.DemoAppTest;

@RunWith(Categories.class)
@IncludeCategory({ Math.class })
@SuiteClasses(value = { DemoAppTest.class })
public class MathRunner {

}
