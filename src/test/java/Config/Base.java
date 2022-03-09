package Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Base {
   public static   WebDriver driver;
    @BeforeSuite
    public void BeforeSuit(){
        System.setProperty(DriverContext.chromeProperty,DriverContext.chromeDriverPath);
        DriverContext.driver = new ChromeDriver();
        driver = DriverContext.driver;
    }


    /*//ParallelTesting methodlara aid olmayanda bunu baglamaq lazimdir
    @BeforeMethod
    public void BeforeMethodForParallelTesting(){
        System.setProperty(DriverContext.chromeProperty,DriverContext.chromeDriverPath);
        DriverContext.driver = new ChromeDriver();
    }*/
}
