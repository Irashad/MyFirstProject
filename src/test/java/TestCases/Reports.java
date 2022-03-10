package TestCases;
import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Reports {
    ExtentReports extent;
    ExtentSparkReporter spark;

    WebDriver driver;
    @BeforeTest
    public void beforeTes()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\resha\\IdeaProjects\\MyFirstProject\\src\\test\\java\\Drivers\\chromedriver97469271.exe");
        driver = new ChromeDriver();

        extent = new ExtentReports();
        spark  = new ExtentSparkReporter("target/Spark/LoginFunctionality.html");
        extent.attachReporter(spark);

    }

    @Test
    public void TestCase1(){
        ExtentTest test1 = extent.createTest("TestCase1");
        driver.get("http://eaapp.somee.com/");
        test1.log(Status.INFO,"Sayta yonlendirilir");
        test1.log(Status.PASS,"Test ugurla bitirilidi");
    }

    @Test
    public void TestCase2() throws InterruptedException {
        String username="admin";
        String password="password";
        ExtentTest test2 = extent.createTest("Login Case");
        Thread.sleep(2000);
      driver.findElement(By.id("loginLink")).click();
      test2.log(Status.INFO,"Login buttonuna clicklendi");

      Thread.sleep(3000);
      driver.findElement(By.id("UserName")).sendKeys(username);
        test2.log(Status.INFO,"Ad yazildi:"+username);
      driver.findElement(By.id("Password")).sendKeys(password);
        test2.log(Status.INFO,"Password yazildi: "+password);
        driver.findElement(By.cssSelector("input[type='submit']")).click();
        test2.log(Status.INFO,"Girise clicklendi");


        Thread.sleep(3000);
      String sehifedeOlan = driver.findElement(By.cssSelector("a[title='Manage']")).getText();
      String expected = "Hello admin!";
      if(sehifedeOlan.equals(expected))
      {
          test2.log(Status.PASS,"Login ugurlu oldu");
          Assert.assertEquals(sehifedeOlan,expected);
      }else {
          test2.log(Status.FAIL,"Login ugursuz oldu");
          Assert.assertEquals(sehifedeOlan,expected);
      }

    }

    @AfterTest
    public void afterTest()
    {
        extent.flush();
    }

}
