package TestCases;

import Config.Base;
import Config.DriverContext;
import Generics.ExcelUtility;
import POM.HomePage;
import POM.LoginPage;

import TestCases.IListener.TestListener;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;




@Listeners(TestListener.class)
public class test1 extends Base {



    @Test
    public void login() {

        DriverContext.driver.get("http://eaapp.somee.com/");
        HomePage homePage = new HomePage();
        homePage.clickSignInBtn();
        LoginPage loginPage = new LoginPage();
        loginPage.sendKeysToUserName("username");
        loginPage.sendKeysToPassword("password");
        loginPage.clickLoginBtn();

    }

    @Test
    public void skipCase() {

        DriverContext.driver.get("http://eaapp.somee.com/");
        throw new SkipException("Test Ignore edildi");

    }


    @Test
    public void failCase()
    {

        Assert.fail();
    }



}
