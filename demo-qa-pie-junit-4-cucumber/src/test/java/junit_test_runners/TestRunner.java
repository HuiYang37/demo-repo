package junit_test_runners;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import demo_junit_tests.DemoAppTest;
import demo_junit_tests.DogTest;

@RunWith(Suite.class)
@SuiteClasses({ DogTest.class, DemoAppTest.class })
public class TestRunner {

}
