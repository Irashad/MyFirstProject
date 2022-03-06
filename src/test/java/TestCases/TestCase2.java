package TestCases;

import Config.Base;
import Generics.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestCase2 extends Base {

    String url="http://demo.automationtesting.in/Alerts.html";
    @Test
    public void s1()
    {
        By idIm = By.id("ee");

         /*driver.findElement(idIm);





        Helper helper = new Helper(driver);
        helper.getUrl(url);*/

    }




}
