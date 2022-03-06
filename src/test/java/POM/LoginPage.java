package POM;

import Config.Base;
import Config.DriverContext;
import Generics.Helper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
    WebDriver driver;
    Helper element;
    public LoginPage()
    {
       driver = DriverContext.driver;
       element = new Helper();

    }



    By userNameInputField = By.id("UserName");

    By passwordInputField = By.id("Password");

    By loginBtn = By.cssSelector("input[type='submit']");



    public void sendKeysToUserName(String userName)
    {
     //   driver.findElement(userNameInputField).sendKeys(userName);
        element.sendkeys(userNameInputField,5,userName);

    }

    public void getUserNameText()
    {
        driver.findElement(userNameInputField).getText();
    }

    public void sendKeysToPassword(String password)
    {
        driver.findElement(passwordInputField).sendKeys(password);

    }


    public void clickLoginBtn()
    {
      driver.findElement(loginBtn).click();
    }



}
