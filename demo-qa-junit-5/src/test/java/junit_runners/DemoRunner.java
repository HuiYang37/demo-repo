package junit_runners;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages({ "demo_tests.junit_tests" })
@IncludeTags({ "demo" })
public class DemoRunner {

}
