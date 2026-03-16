package tests;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryScript implements IRetryAnalyzer {

    int retryCount = 0;
    int maxRetry = 2;

    @Override
    public boolean retry(ITestResult result) {
        if(!result.isSuccess()){
            TestCaseBase.test.fail(result.getName());
            Throwable error = result.getThrowable();
            if(error != null){
                TestCaseBase.test.fail(error.getMessage());
            }
            if(retryCount < maxRetry){
                retryCount++;
                return true;
            }
        }else{
            return false;
        }
        return false;
    }
}
