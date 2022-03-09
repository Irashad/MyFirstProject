package Reporting;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Reporting  {
    public static ExtentReports extent;
    public static ExtentSparkReporter spark;
    public static ExtentTest test;

    public static void setParameters(String HtmlReportFileName)
    {
        extent = new ExtentReports();
        spark= new ExtentSparkReporter("target/Spark/"+HtmlReportFileName);
        spark.config().setTheme(Theme.DARK);
        extent.attachReporter(spark);
    }
}
