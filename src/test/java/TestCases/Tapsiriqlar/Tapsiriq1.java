package TestCases.Tapsiriqlar;

import Config.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Tapsiriq1 extends Base {

    @Test
    public void tapsiriq2()
    {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.findElement(By.name("username")).sendKeys("Faiq");
        driver.findElement(By.name("password")).sendKeys("998877");
        driver.findElement(By.xpath("//input[@type='submit']")).click();
      System.out.println(  driver.findElement(By.xpath("//h1[@class='title']")).getText());
    }


    @Test
    public void tapsiriq3()
    {
        driver.get("https://demo.applitools.com/");
        SoftAssert softAssert = new SoftAssert();

    }
}
