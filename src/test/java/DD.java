import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class DD {

    @BeforeTest
    public void TestCase()
    {
        //versiya 97
        System.setProperty("webdriver.chrome.driver","C:\\Users\\resha\\IdeaProjects\\MyFirstProject\\src\\test\\java\\chromedriver97469271.exe");
    }

    @Test
    public void TestCase2()
    {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.coursera.org/");
        System.out.println("passed");
    }

}
