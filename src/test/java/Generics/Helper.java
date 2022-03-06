package Generics;

import Config.DriverContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Helper {
    WebDriver driver;  // chromedriver
    WebDriverWait wait;

   /* public void seleniumuAyarla(WebDriver gelenDriver)
    {
        driver = gelenDriver;
    }*/

    public Helper()
    {
        driver = DriverContext.driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }



    public void click(By elementBy, int timeout)
    {
        wait.withTimeout(Duration.ofSeconds(timeout)).until(ExpectedConditions.visibilityOfElementLocated(elementBy)).click();
    }


    public void sendkeys(By elementtosendKeys, int timeout, String textInput )
    {
        wait.withTimeout(Duration.ofSeconds(timeout)).until(ExpectedConditions.visibilityOfElementLocated(elementtosendKeys)).sendKeys(textInput);
    }



    public void getUrl(String link)
    {
        driver.get(link);
    }



}
