package util;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
    private int count = 0;
    private static int retryLimit = 3;

    @Override
    public boolean retry(ITestResult iTestResult) {
        if(!iTestResult.isSuccess()){ //checks if test succeeds or not
            if (count < retryLimit){ //checks the limit of retryLimit, which is 3
                count++; //increases the retryLimit by 1
                iTestResult.setStatus(ITestResult.FAILURE); //marks the test as failed
                return true; //tells TestNG to re-run the test
            }else{
                iTestResult.setStatus(ITestResult.FAILURE); //if retryLimit count is reached, test will be marked as failed
            }
        }else{
            iTestResult.setStatus(ITestResult.SUCCESS); //if test passes, TestNG will mark it as passed
        }
        return false;
    }
}
