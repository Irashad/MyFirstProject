package TestCases.executor;

import Config.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class script extends Base {
    @Test
    public void scrollDown() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.get("https://demoqa.com/");
        Thread.sleep(2000);
         driver.manage().window().maximize();

         driver.manage().window().getSize();
        js.executeScript("window.scrollBy(0,500)");
    }

    @Test
    public void cldick() throws InterruptedException {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        driver.get("https://demoqa.com/broken");
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath("//*[@id='app']/div/div/div[2]/div[2]/div[2]/a[1]"));
        javascriptExecutor.executeScript("arguments[0].click();",element);

    }


    @Test
    public void alertBox()
    {
        driver.get("https://demoqa.com/broken");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.alert('Alert Boxumuz');");
    }

    @Test
    public void windowopen()
    {
        driver.get("https://demoqa.com/broken");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.open()");
    }

}
