package junit.test_runners;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import junit.tests.DemoAppTest;
import junit.tests.DogTest;

@RunWith(Suite.class)
@SuiteClasses({ DogTest.class, DemoAppTest.class })
public class TestRunner {

}
