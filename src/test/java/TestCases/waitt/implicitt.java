package TestCases.waitt;

import Config.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class implicitt extends Base {

    @Test
    public void impl()
    {
        driver.get("https://demoqa.com/text-box");
        driver.findElement(By.id("userName")).sendKeys("ismayil");
        driver.findElement(By.id("userEmail")).sendKeys("qedirov");
    }

}
