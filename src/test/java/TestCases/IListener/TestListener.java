package TestCases.IListener;

import Reporting.Reporting;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult result) {
        ITestListener.super.onTestStart(result);
        System.out.println("Test Case Basladi: " +result.getName());
        String methodName = result.getMethod().getMethodName();
        Reporting.test =  Reporting.extent.createTest(methodName);
        Reporting.test.log(Status.INFO,"Test Case "+methodName+ " startted");
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        ITestListener.super.onTestSuccess(result);
        System.out.println("Test Case Succes oldu: " + result.getName());
        String methodName = result.getMethod().getMethodName();
        Reporting.test.log(Status.PASS, "Test Case "+methodName+ " Successed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        ITestListener.super.onTestFailure(result);
        System.out.println("Test Case Fail oldu: " + result.getName());
        String methodName = result.getMethod().getMethodName();
        Reporting.test.log(Status.FAIL, "Test Case "+methodName+ " Failed");

    }

    @Override
    public void onTestSkipped(ITestResult result) {
        ITestListener.super.onTestSkipped(result);
        System.out.println("Test Case Skip oldu: " + result.getName());

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
        System.out.println("Umumi test Basladi  : " + context.getName());

    }

    @Override
    public void onFinish(ITestContext context) {
        ITestListener.super.onFinish(context);
        System.out.println("Umumi test Bitdi  : " + context.getName());

    }
}
