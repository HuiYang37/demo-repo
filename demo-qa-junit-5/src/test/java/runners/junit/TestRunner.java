package runners.junit;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

import practices.ui.AlertPractice;

@Suite
@SelectClasses(value = { AlertPractice.class })
public class TestRunner {

}
