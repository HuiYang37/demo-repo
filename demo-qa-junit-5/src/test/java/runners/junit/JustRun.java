package runners.junit;

import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages(value = { "tests.ui" })
public class JustRun {

}
