package tests.extensions;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class AfterTestAction implements AfterTestExecutionCallback {

	@Override
	public void afterTestExecution(ExtensionContext context) throws Exception {
		boolean result = context.getExecutionException().isPresent();
		if (result)
			System.out.println("Test failed.\n");
		else
			System.out.println("Test passed.\n");
	}

}
