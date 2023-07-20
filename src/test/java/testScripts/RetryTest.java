package testScripts;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryTest implements IRetryAnalyzer {

	private int retryCount = 0;
	private static final int maxtryCount = 3;

	@Override
	public boolean retry(ITestResult result) {

		if (!result.isSuccess()) {
			if (retryCount < maxtryCount) {
				retryCount++;
				return true;
			}
		}
		return false;

	}
}
