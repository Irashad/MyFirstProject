package TestCases.Proxy;
import Config.DriverContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;

public class sampleProxy  {
    public  WebDriver driver;

    @BeforeSuite
    public void BeforeSuit(){
        System.setProperty(DriverContext.chromeProperty,DriverContext.chromeDriverPath);
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--proxy-server=190.205.32.70:999");
        driver = new ChromeDriver(options);
    }
    @Test
    public void s()
    {
        driver.get("https://www.google.com");
    }


}
