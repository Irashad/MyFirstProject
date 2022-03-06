/*
package TestCases.Alerts;

import Config.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AlertWithText extends Base {


    String ExpectedText = "I am an alert box!";

    @Test
    public void acceptAlert() throws InterruptedException {
        driver.get("http://demo.automationtesting.in/Alerts.html");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("a[href='#OKTab']")).click();
        driver.findElement(By.cssSelector("button[onclick='alertbox()']")).click();
        Thread.sleep(2000);
        String actualResultText =  driver.switchTo().alert().getText();



    //    Assert.assertEquals(actualResultText,ExpectedText);


        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(actualResultText,"s");
        softAssert.assertEquals(actualResultText,"s");
        softAssert.assertEquals(actualResultText,"s");

        System.out.println("Test passed");

        //dsfsdf

        //sdfsdfsdf



    }
}
*/
