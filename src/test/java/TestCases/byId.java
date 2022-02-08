package TestCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class byId {
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
        String expectedName = "Ramil";
        System.setProperty("webdriver.chrome.driver","C:\\Users\\resha\\IdeaProjects\\MyFirstProject\\src\\test\\java\\chromedriver97469271.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");

        //WebElement inputfield = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
        driver.findElement(By.id("userName")).sendKeys("Ramil");
        driver.findElement(By.id("userEmail")).sendKeys("Ramil@example.com");
        driver.findElement(By.id("currentAddress")).sendKeys("adresss");
        driver.findElement(By.id("permanentAddress")).sendKeys("qalici adress");

        driver.findElement(By.id("submit")).click();

        String actualName= driver.findElement(By.id("name")).getText();

        if(actualName.contains("Ramil")) // Name:Ramil
        {
            System.out.println("Test Passed");
            Assert.assertTrue(true);
        }
        else{
            System.out.println("Test Failed names are different");
            Assert.assertTrue(false);
        }

    }

}
