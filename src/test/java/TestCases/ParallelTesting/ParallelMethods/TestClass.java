package TestCases.ParallelTesting.ParallelMethods;

import Config.Base;
import Config.DriverContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {
    WebDriver driver;
    WebDriver driver2;
    @Test
    public void test1()
    {
        System.setProperty(DriverContext.chromeProperty,DriverContext.chromeDriverPath);
        driver= new ChromeDriver();
        driver.get("https://demo.guru99.com/test/guru99home/");
    }


    @Test
    public void test2()
    {
        System.setProperty(DriverContext.chromeProperty,DriverContext.chromeDriverPath);
        driver2= new ChromeDriver();
        driver2.get("https://www.google.com/sheets/about/");
    }
}
