package TestCases.cases;
// Generated by Selenium IDE
import Config.DriverContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class SeleniumD {


    private WebDriver driver;
    private Map<String, Object> vars;

    JavascriptExecutor js;

    @BeforeSuite
    public void setUp() {
        System.setProperty(DriverContext.chromeProperty,DriverContext.chromeDriverPath);
        driver = new ChromeDriver();
        js = (JavascriptExecutor) driver;
        vars = new HashMap<String, Object>();  // acar sozun tipi String, obyekt

    }


    @AfterSuite
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void firstTestCaseInDemoSite() {
        // Test name: FirstTestCaseInDemoSite

        // Step # | name | target | value
        // 1 | open | /text-box |
        driver.get("https://demoqa.com/text-box");
        // 2 | setWindowSize | 1180x653 |
        driver.manage().window().setSize(new Dimension(1180, 653));
        // 3 | click | id=userName |
        // username fielde clicklendi
        driver.findElement(By.id("userName")).click();
        // 4 | type | id=userName | Firuze
        // username fielde yazi yazdilirdi
        driver.findElement(By.id("userName")).sendKeys("Firuze");
        // 5 | click | id=userEmail |
        // email fielde clicklendi
        driver.findElement(By.id("userEmail")).click();
        // 6 | type | id=userEmail | tesst@Gmail.com
        // yazi yazildi
        driver.findElement(By.id("userEmail")).sendKeys("tesst@Gmail.com");
        // 7 | click | id=currentAddress |
        // address bara clicklendi
        driver.findElement(By.id("currentAddress")).click();
        // 8 | type | id=currentAddress | acb
        // address bara yazi yazildi
        driver.findElement(By.id("currentAddress")).sendKeys("acb");
        // 9 | click | css=.playgound-header |
        // sadece sehifenin kenarina clicklendi
        driver.findElement(By.cssSelector(".playgound-header")).click();
    }
}
