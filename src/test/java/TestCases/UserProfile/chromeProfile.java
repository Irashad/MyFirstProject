package TestCases.UserProfile;
import Config.DriverContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * By Passing login case with chrome Dir*/
public class chromeProfile  {
    public static WebDriver driver;
    public static ChromeOptions options;

    @BeforeSuite
    public void st()
    {

         options = new ChromeOptions();
        //burada nezere almaq lazimdiki normalda chromu acanda profil secimleri hissesi gelirse orda asagida sagda show on startup sozu var ordaki checkboxu goturmek lazimdki bir cox profil varsa default olaraq birini secsin
        options.addArguments("user-data-dir=C:\\Users\\resha\\AppData\\Local\\Google\\Chrome\\User Data");

        System.setProperty(DriverContext.chromeProperty,DriverContext.chromeDriverPath);
        driver = new ChromeDriver(options);
    }

    @Test
    public void test1()
    {

        driver.get("https://www.stackoverflow.com");
    }


    @Test
    public void test2()
    {
        //driver = new ChromeDriver(options);
        driver.get("https://www.stackoverflow.com");
    }


    @AfterSuite
    public void after()
    {
        driver.get("https://www.stackoverflow.com");
    }
}
