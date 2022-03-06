package TestCases.ParallelTesting.CrossBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class class2 {
    @Test
    public void class2method1() {

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\resha\\IdeaProjects\\MyFirstProject\\Drivers\\chromedriver97469271.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.findElement(By.id("userName")).sendKeys("ismayil");
        driver.findElement(By.id("userEmail")).sendKeys("qedirov");
    }
}
