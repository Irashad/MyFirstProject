/*
package TestCases;
import Config.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;


public class TestCase  extends Base {

    String MyUrl="https://www.google.com/";
    @Test
    public void test() throws InterruptedException {

        getUrl(MyUrl);
        driver.findElement(By.name("q")).sendKeys("Cars");
        Thread.sleep(3000);
        driver.findElement(By.name("btnK")).click();
        Thread.sleep(5000);
        String s = driver.findElement(By.name("q")).getAttribute("value");
        System.out.println("your string is" +s);
    }

    public void getUrl(String url)
    {

        driver.get(url);
    }

}
*/
