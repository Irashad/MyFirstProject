package TestCases.ParallelTesting.ParallelClasses;

import Config.Base;
import Config.DriverContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testclass1   {
      WebDriver driver;
    @BeforeClass
    public void beforeClass()
    {
        System.setProperty(DriverContext.chromeProperty,DriverContext.chromeDriverPath);
        driver = new ChromeDriver();

    }
    @Test
    public void t1()
    {
        driver.get("https://demo.guru99.com/test/guru99home/");
        //login cred. yaz

    }
    @Test
    public void t2()
    {
        System.out.println("Test class 1 test 2");

        //esas test case
    }




}
