package TestCases;

import Config.Base;
import Config.DriverContext;
import POM.HomePage;
import POM.LoginPage;
import org.testng.annotations.Test;

public class pageFactoryTest extends Base {

    @Test
    public void login() {

        DriverContext.driver.get("http://eaapp.somee.com/");
        HomePage homePage = new HomePage();
        homePage.clickSignInBtn();
        LoginPage loginPage = new LoginPage();
        loginPage.sendKeysToUserName("admin");
        loginPage.sendKeysToPassword("password");
        loginPage.clickLoginBtn();

    }
}
