package TestCases.AUI;

 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 import org.openqa.selenium.interactions.Action;
 import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DoubleClick   {
    WebDriver driver;
    @BeforeTest
    public void BeforeTest(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\resha\\IdeaProjects\\MyFirstProject\\src\\test\\java\\chromedriver97469271.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void doubleClick() throws InterruptedException {
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        Thread.sleep(5000);
        driver.manage().window().maximize();
        WebElement link =driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        Actions s = new Actions(driver);
        Action douibl = s.doubleClick(link).build();
        douibl.perform();
        new Actions(driver).doubleClick(link).build().perform();
        ///Actions builder = new Actions(driver);
        //Action action =builder.doubleClick(link).build(); action.perform();
        //or
        // ---  Action action =builder.doubleClick(target WebElement).build();

        driver.switchTo().alert().accept();
        Assert.assertTrue(true);
        Thread.sleep(3000);

    }
}


