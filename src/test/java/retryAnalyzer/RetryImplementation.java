package retryAnalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryImplementation implements IRetryAnalyzer{

	int count = 0;
	int maxRetries = 3;
	
	@Override
	public boolean retry(ITestResult result) {
		if(count < 3) {
			count++;
			return true;
		}
		
		return false;
	}

}
