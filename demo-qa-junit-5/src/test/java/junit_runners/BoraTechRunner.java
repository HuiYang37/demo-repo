package junit_runners;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages(value = { "database_practices" })
@IncludeTags(value = { "table" })
public class BoraTechRunner {

}
