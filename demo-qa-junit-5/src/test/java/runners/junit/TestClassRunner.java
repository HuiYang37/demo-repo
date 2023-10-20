package runners.junit;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import practices.ui.AlertPracticeTest;

@Suite
@SelectClasses(value = { AlertPracticeTest.class })
public class TestClassRunner {

}
