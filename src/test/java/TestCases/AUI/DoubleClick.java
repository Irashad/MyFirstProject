package TestCases.AUI;

 import Config.Base;
 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 import org.openqa.selenium.interactions.Action;
 import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DoubleClick  extends Base {

    @Test
    public void doubleClick() throws InterruptedException {
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");

        Thread.sleep(5000);

         WebElement link =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));

         Actions builder = new Actions(driver);

         Action ikiDefeClickEt = builder.doubleClick(link).build();
        ikiDefeClickEt.perform();
        //new Actions(driver).doubleClick(link).build().perform();

    }
}


