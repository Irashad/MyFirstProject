package TestCases.WindowsHandles;

import Config.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class HandleWindow extends Base {
    @Test
    public void windowhandlemethod1() throws InterruptedException {
        driver.get("https://www.google.com/search?q=facebook");
       String currentTab =  driver.getWindowHandle(); // 3749088A2E32C294B7F9BB97407DC162

        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.open()");

        System.out.println(driver.getWindowHandles());
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://www.linkedin.com/");

        driver.switchTo().window(currentTab);


    }



}
