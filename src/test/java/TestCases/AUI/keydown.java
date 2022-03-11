
package TestCases.AUI;
import Config.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.indexeddb.model.Key;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.awt.*;

public class keydown extends Base {

    @Test
    public void ff()   {
        driver.get("https://demoqa.com/text-box");

        Actions builder = new Actions(driver);

        WebElement inputfield = driver.findElement(By.id("userName"));


        Action seriesofActions = builder
                .click()
                .keyDown(inputfield,Keys.SHIFT)
                .sendKeys("salam").build();


        seriesofActions.perform();
    }
}
