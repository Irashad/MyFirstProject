package Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.time.Duration;

public class Base {
   public static   WebDriver driver;
    public static WebDriverWait wait;

    @BeforeSuite
    public void BeforeSuit(){
        System.setProperty(DriverContext.chromeProperty,DriverContext.chromeDriverPath);
        DriverContext.driver = new ChromeDriver();
        driver = DriverContext.driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }


    /*//ParallelTesting methodlara aid olmayanda bunu baglamaq lazimdir
    @BeforeMethod
    public void BeforeMethodForParallelTesting(){
        System.setProperty(DriverContext.chromeProperty,DriverContext.chromeDriverPath);
        DriverContext.driver = new ChromeDriver();
    }*/
}
