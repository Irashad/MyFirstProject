package POM;
import Config.DriverContext;
import Generics.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Listeners;

import java.time.Duration;


public class HomePage  {
    WebDriver driver;
    WebDriverWait wait;
    Helper element;
    public HomePage()
    {
        driver = DriverContext.driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        element = new Helper();
    }

   /* @FindBy(how = How.CSS, using = "input[@id='dd']")
    WebElement element;*/

    By login = By.id("loginLink");
    By visitNowBtn = By.xpath("/html/body/div[2]/div[1]/table/tbody/tr/td/a");

    public void clickSignInBtn()
    {
        element.click(login,6);
    }







}
