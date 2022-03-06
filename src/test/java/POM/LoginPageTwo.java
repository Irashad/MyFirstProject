package POM;

import Config.DriverContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPageTwo {

    WebDriver driver;
    public LoginPageTwo()
    {

        driver = DriverContext.driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy(how = How.ID, using = "UserName")
    WebElement userNameInputField;

    @FindBy(how = How.ID, using = "Password")
    WebElement passwordInputField;

    @FindBy(how = How.CSS, using ="input[type='submit']" )
    WebElement loginBtn;



    public void sendKeysToUserName(String userName)
    {

        userNameInputField.sendKeys(userName);

    }

    public void getUserNameText()
    {
        userNameInputField.getText();
    }

    public void sendKeysToPassword(String password)
    {
       passwordInputField.sendKeys(password);

    }


    public void clickLoginBtn()
    {
        loginBtn.click();
    }


}
