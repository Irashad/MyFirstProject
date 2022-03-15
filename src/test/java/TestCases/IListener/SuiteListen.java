package TestCases.IListener;

import Reporting.Reporting;
import org.testng.ISuite;
import org.testng.ISuiteListener;

import java.util.Locale;

public class SuiteListen implements ISuiteListener {

    @Override
    public void onStart(ISuite suite) {
        ISuiteListener.super.onStart(suite);
        String suiteName = suite.getName().toLowerCase(Locale.ROOT);
        Reporting.setParameters(suiteName+".html"); // testreportum.html

    }

    @Override
    public void onFinish(ISuite suite) {
        ISuiteListener.super.onFinish(suite);
        Reporting.extent.flush();
    //    System.out.println(suite.getSuiteState());
    }
}
