package runners.junit;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages(value = { "tests" })
@IncludeTags(value = { "smoke" })
public class RunSmoke {

}
