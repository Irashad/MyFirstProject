package POM;

import Config.DriverContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePageTwo {

    WebDriver driver;

    public HomePageTwo()
    {
        driver = DriverContext.driver;
        PageFactory.initElements(driver,this);

    }



    @FindBy(how = How.ID, using = "loginLink")
    WebElement login;

    public void clickSignInBtn()
    {
       login.click();
    }

}
