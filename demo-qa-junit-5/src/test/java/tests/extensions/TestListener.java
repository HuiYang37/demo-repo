package tests.extensions;

import org.junit.jupiter.api.extension.AfterTestExecutionCallback;
import org.junit.jupiter.api.extension.BeforeTestExecutionCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

public class TestListener implements AfterTestExecutionCallback, BeforeTestExecutionCallback {

	@Override
	public void afterTestExecution(ExtensionContext context) throws Exception {
		boolean result = context.getExecutionException().isPresent();
		if (result)
			System.out.println("Test failed.\n");
		else
			System.out.println("Test passed.\n");
	}

	@Override
	public void beforeTestExecution(ExtensionContext context) throws Exception {
		String testName = context.getTestMethod().get().getName();
		System.out.println(String.format("Test <%s>:", testName));
	}

}
