package TestCases.headless;

import Config.DriverContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import java.time.Duration;

public class headlessChrome {
    WebDriver driver;
    WebDriverWait wait;
    @Test
    public void headlesS()
    {
        System.setProperty(DriverContext.chromeProperty,DriverContext.chromeDriverPath);
        // TODO Auto-generated method stub
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        /*DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        options.merge(capabilities);*/
        driver = new ChromeDriver(options);
        driver.get("http://demo.guru99.com/");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println("Page Title: " +title);

    }


    //Examplelardan her hansi birini headless browser ile yoxlayaq
    @Test
    public void rightWayOfGettingToolTipValue()
    {
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        driver.get("https://www.w3schools.com/css/css_tooltip.asp");
        Actions builder = new Actions(driver);
        Action act = builder.moveToElement(
                wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.tooltip")))).build();
        act.perform();
        out(wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.tooltip>span"))).getText());
    }

    public  void out(String s)
    {
        System.out.println(s);
    }

    @AfterSuite
    public void after()
    {
        driver.quit();
    }
}
