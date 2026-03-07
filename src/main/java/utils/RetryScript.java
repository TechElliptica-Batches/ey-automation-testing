package utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryScript implements IRetryAnalyzer {

    int retryCount = 0;
    int maxRetry = 2;

    @Override
    public boolean retry(ITestResult result) {
        if(!result.isSuccess()){
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
