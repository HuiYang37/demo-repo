package runners.junit;

import org.junit.platform.suite.api.IncludeTags;
import org.junit.platform.suite.api.SelectPackages;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectPackages(value = { "practices.database" })
@IncludeTags(value = { "table" })
public class BoraTechRunner {

}
