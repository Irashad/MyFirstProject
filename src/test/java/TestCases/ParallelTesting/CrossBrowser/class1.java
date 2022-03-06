package TestCases.ParallelTesting.CrossBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class class1 {
    @Test
    public void class1method1()
    {
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver","C:\\Users\\resha\\IdeaProjects\\MyFirstProject\\Drivers\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://demoqa.com/text-box");
        driver.findElement(By.id("userName")).sendKeys("ismayil");
        driver.findElement(By.id("userEmail")).sendKeys("qedirov");
    }
}
