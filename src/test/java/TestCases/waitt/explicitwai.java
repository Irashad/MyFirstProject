package TestCases.waitt;

import Config.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class explicitwai extends Base {
    WebDriverWait wait;
    @Test
    public void explicit()
    {
     WebElement d = driver.findElement(By.id("ss"));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://demoqa.com/text-box"); // gecko.com

        wait.withTimeout(Duration.ofSeconds(4)).until(ExpectedConditions.visibilityOfElementLocated(By.id("userName"))).sendKeys("ismayil");
        wait.withTimeout(Duration.ofSeconds(8)).until(ExpectedConditions.visibilityOfElementLocated(By.id("userEmail"))).sendKeys("qedirov@gmail.com");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sadasd"))).sendKeys("asdasd");

    }
}
