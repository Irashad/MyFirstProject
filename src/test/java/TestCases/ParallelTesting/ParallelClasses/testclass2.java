package TestCases.ParallelTesting.ParallelClasses;

import Config.Base;
import Config.DriverContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class testclass2 {

    WebDriver driver;
    @BeforeClass
    public void beforeClass()
    {
        System.setProperty(DriverContext.chromeProperty,DriverContext.chromeDriverPath);
        driver = new ChromeDriver();
    }
    @Test
    public void b1()
    {
        driver.get("https://www.google.com/sheets/about/");
        //login cred. yaz
    }

    @Test
    public void b2()
    {
        System.out.println("Test class 2 test 2");
        //esas test case
    }

}
