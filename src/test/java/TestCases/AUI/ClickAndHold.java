package TestCases.AUI;

 import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
 import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ClickAndHold {
   //TODO:
   WebDriver driver;
    @BeforeTest
    public void BeforeTest(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\resha\\IdeaProjects\\MyFirstProject\\src\\test\\java\\chromedriver97469271.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void rightClick()
    {
        driver.manage().window().maximize();

        String url = "https://selenium08.blogspot.com/2020/01/click-and-hold.html";
        driver.get(url);

        WebElement titleC = driver.findElement(By.xpath("//li[text()= 'C']"));


       Actions builder = new Actions(driver);


        Action hoveronElement = builder.moveToElement(titleC).build(); // Call clickAndHold() method to perform click and hold operation.
        hoveronElement.perform();

        Action clickAndHold = builder.clickAndHold().build();
        clickAndHold.perform();

        WebElement textSide=driver.findElement(By.xpath("//h3[contains(text(),'Click and Hold in')]"));
        Action moveToAnotherSide = builder.moveToElement(textSide).build();
        moveToAnotherSide.perform();
    }
    @AfterTest
    public void afterTest(){System.out.println("Test Finished Successfully");}
}
