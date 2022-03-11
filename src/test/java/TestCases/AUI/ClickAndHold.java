package TestCases.AUI;

 import Config.Base;
 import Config.DriverContext;
 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
 import org.testng.annotations.BeforeSuite;
 import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClickAndHold {
    public static   WebDriver driver;
    @BeforeSuite
    public void BeforeSuit(){
        System.setProperty(DriverContext.chromeProperty,DriverContext.chromeDriverPath);
        DriverContext.driver = new ChromeDriver();
        driver = DriverContext.driver;
    }

    @Test
    public void rightClick()
    {
        driver.manage().window().maximize();

        String url = "https://selenium08.blogspot.com/2020/01/click-and-hold.html";
        driver.get(url);

        // Advanced  User Interaction

        WebElement titleC = driver.findElement(By.xpath("//li[text()= 'C']"));


        Actions builder = new Actions(driver);


        Action hoveronElement5 = builder.moveToElement(titleC).build(); // Call clickAndHold() method to perform click and hold operation.
        hoveronElement5.perform();


        Action clickAndHold = builder.clickAndHold().build();
        clickAndHold.perform();

        WebElement elementim=driver.findElement(By.xpath("//h3[contains(text(),'Click and Hold in')]"));

        Action moveToAnotherSide = builder.moveToElement(elementim).build();
        moveToAnotherSide.perform();
    }





    @AfterTest
    public void afterTest(){System.out.println("Test Finished Successfully");}
}
