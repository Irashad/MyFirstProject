package TestCases.Parameter;

import Config.Base;
import Config.DriverContext;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class param{


/*    @Parameters({"name2","surname2"})
    @Test
    public void withparameters(String ad, String soyad)
    {
      //  System.out.println(ad + " "+soyad);
        driver.get("https://demoqa.com/text-box");
        driver.findElement(By.id("userName")).sendKeys(ad);
        driver.findElement(By.id("userEmail")).sendKeys(soyad);
    }*/


    @Parameters({"chrome","chromepath"}) //  webdriver.chrome.driver
    //C:\Users\resha\IdeaProjects\MyFirstProject\Drivers\chromedriver97469271.exe
    @Test
    public void withparameters(String property, String path)
    {
        System.setProperty(property,path);

        WebDriver driver = chooseBrowser(property);// >   new FirefoxDriver();
       // WebDriver  driver = new ChromeDriver();
      //  WebDriver  driver = new FirefoxDriver();

      //  System.out.println(ad + " "+soyad);
        driver.get("https://demoqa.com/text-box");
        driver.findElement(By.id("userName")).sendKeys("aaa");
        driver.findElement(By.id("userEmail")).sendKeys("bbb");
    }



    public WebDriver  chooseBrowser(String param)
    {
        if(param.equals("webdriver.chrome.driver"))
        {
            return new ChromeDriver();
        }
        else if(param.equals("webdriver.gecko.driver"))
        {
            return  new FirefoxDriver();
        }
        return null;
    }








  /*  WebDriverWait wait;
    @Test
    public void withparameters() throws InterruptedException {
        driver.get("https://demoqa.com/text-box");
        driver.findElement(By.id("userName")).sendKeys("ismayil");
        driver.findElement(By.id("userEmail")).sendKeys("qedirov");
    }*/



}
