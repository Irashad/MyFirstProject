package TestCases.IListener;

import Reporting.Reporting;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {
    public static boolean hasFailedTest = false;
    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
        String methodName = result.getMethod().getMethodName();
        Reporting.test =  Reporting.extent.createTest(methodName);
        Reporting.test.log(Status.INFO,"Test Case "+methodName+ " startted");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
        String methodName = result.getMethod().getMethodName();
        Reporting.test.log(Status.PASS, "Test Case "+methodName+ " Successed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
        String methodName = result.getMethod().getMethodName();
        Reporting.test.log(Status.FAIL, "Test Case "+methodName+ " Failed");
        hasFailedTest = true;

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
    }

    @Override
    public void onTestFailedWithTimeout(ITestResult result) {
        ITestListener.super.onTestFailedWithTimeout(result);
    }

    @Override
    public void onStart(ITestContext context) {
        ITestListener.super.onStart(context);

    }

    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
        if(context.getFailedTests().size() != 0 )  // 1 !=    -> true
        {
            System.out.println("Test Failed");
        }else{
            System.out.println("Test Success");
        }
    }
}
