package TestCases.cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class partialLink {
    WebDriver driver;
    @BeforeTest
    public void BeforeTest(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\resha\\IdeaProjects\\MyFirstProject\\src\\test\\java\\chromedriver97469271.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void linkText() {
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        //driver.findElement(By.linkText("CONTACT")).click();
        driver.findElement(By.partialLinkText("IGN")).click();
    }
}
