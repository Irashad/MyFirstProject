package TestCases;

import Config.Base;
import Config.DriverContext;
import Generics.ExcelUtility;
import POM.HomePage;
import POM.LoginPage;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestCaseEnd extends Base {


    @Test
    public void urleGet() throws InterruptedException   {
        driver.get("http://eaapp.somee.com/");
            Thread.sleep(2000);
    }

    @Test
    public void LoginPageAc() throws InterruptedException {
       HomePage homePage = new HomePage();
       homePage.clickSignInBtn();
       Thread.sleep(2000);
    }

    @Test
    public void login(){

        LoginPage loginPage = new LoginPage();
        loginPage.sendKeysToUserName("admin");
        loginPage.sendKeysToPassword("password");
        loginPage.clickLoginBtn();
    }

}
