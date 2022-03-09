package TestCases.TestCasesForReporting;

import Config.Base;
import Config.DriverContext;
import POM.HomePage;
import POM.LoginPage;
import Reporting.Reporting;

import com.aventstack.extentreports.Status;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;





public class RealCase extends Base {



    @Test
    public void login() {

        Reporting.test.log(Status.INFO,"Navigating to eaapp.com| Login test");
       /* driver.get("http://eaapp.somee.com/");
        HomePage homePage = new HomePage();
        homePage.clickSignInBtn();
        LoginPage loginPage = new LoginPage();
        loginPage.sendKeysToUserName("username");
        loginPage.sendKeysToPassword("password");
        loginPage.clickLoginBtn();*/


    }

    @Test
    public void login2() {
        Reporting.test.log(Status.INFO,"Navigating to eaapp.com| Login2 test");

      /*  driver.get("http://eaapp.somee.com/");
        HomePage homePage = new HomePage();
        homePage.clickSignInBtn();
        LoginPage loginPage = new LoginPage();
        loginPage.sendKeysToUserName("username");
        loginPage.sendKeysToPassword("password");
        loginPage.clickLoginBtn();*/

    }
  /*  @Test
    public void skipCase() {

        DriverContext.driver.get("http://eaapp.somee.com/");
        throw new SkipException("Test Ignore edildi");

    }


    @Test
    public void failCase()
    {

        Assert.fail();
    }*/



}
