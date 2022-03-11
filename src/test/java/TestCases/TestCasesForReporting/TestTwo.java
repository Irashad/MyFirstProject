package TestCases.TestCasesForReporting;

import Config.Base;
import POM.HomePage;
import POM.LoginPage;
import Reporting.Reporting;
import com.aventstack.extentreports.Status;
import org.testng.annotations.Test;

public class TestTwo extends Base {
    @Test
    public void Mogin() {
        Reporting.test.log(Status.INFO,"Navigating to eaapp.com| Mogin test");

        driver.get("http://eaapp.somee.com/");
        HomePage homePage = new HomePage();
        homePage.clickSignInBtn();
        LoginPage loginPage = new LoginPage();
        loginPage.sendKeysToUserName("username");
        loginPage.sendKeysToPassword("password");
        loginPage.clickLoginBtn();
        Reporting.test.createNode("nebilim vallah").log(Status.PASS,"sss");



    }
    @Test
    public void Mogin2() {
        Reporting.test.log(Status.INFO,"Navigating to eaapp.com| Mogin2 test");


      /*  driver.get("http://eaapp.somee.com/");
        HomePage homePage = new HomePage();
        homePage.clickSignInBtn();
        LoginPage loginPage = new LoginPage();
        loginPage.sendKeysToUserName("username");
        loginPage.sendKeysToPassword("password");
        loginPage.clickLoginBtn();*/

    }
}
