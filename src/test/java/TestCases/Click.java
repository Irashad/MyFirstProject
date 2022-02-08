package TestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Click {
    WebDriver driver;
    @Test
    public void ClickHeader() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\resha\\IdeaProjects\\MyFirstProject\\src\\test\\java\\chromedriver97469271.exe");
        driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        Thread.sleep(3000);
        WebElement mainPage = driver.findElement(By.xpath("//body/div/header/a"));
        mainPage.click();
       // driver.findElement(By.xpath("//header/a[@href='https://demoqa.com']")).click();
    }
    @Test
    public void InputUserName() throws InterruptedException {
        String expectedName = "Arif";
        System.setProperty("webdriver.chrome.driver","C:\\Users\\resha\\IdeaProjects\\MyFirstProject\\src\\test\\java\\chromedriver97469271.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");

        WebElement inputfield = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        driver.findElement(By.xpath("//input[@placeholder='Full Name']")).sendKeys(expectedName);


        Thread.sleep(3000);
        String actualName =  driver.findElement(By.xpath("//input[@id='userName']")).getText();

        driver.findElement(By.xpath("//input[@id='userName']")).clear();

      //  Assert.assertEquals(actualName,expectedName);



    }






}
