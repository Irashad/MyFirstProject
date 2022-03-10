package TestCases.IFrame;

import Config.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class frame extends Base {
    WebDriverWait driverWait;

    @Test
    public void s2() throws InterruptedException {
        driverWait= new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.get("http://demo.automationtesting.in/Frames.html");
        Thread.sleep(2000);
        driver.switchTo().frame("singleframe");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("i am text");
        driver.switchTo().defaultContent();
        driver.findElement(By.linkText("Practice Site")).click();


    }//input[@type='text']


    @Test
    public void frameWithError() {
        driverWait= new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.get("http://demo.automationtesting.in/Frames.html");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("i am text");



    }
    @Test
    public void frameWithSucces() {
        driverWait= new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.get("http://demo.automationtesting.in/Frames.html");
        driver.switchTo().frame("singleframe");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("i am text");


    }

    @Test
    public void frameWithSwitchToDefaultContent() {
        driverWait= new WebDriverWait(driver,Duration.ofSeconds(10));
        driver.get("http://demo.automationtesting.in/Frames.html");
        driver.switchTo().frame("singleframe");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("i am text");

        driver.switchTo().defaultContent();
        driver.findElement(By.xpath("//li/a[@href='Index.html']")).click();


    }



    @Test
    public void multipleIframes()
    {
        driver.get("http://demo.automationtesting.in/Frames.html");
       driver.findElement(By.xpath("//a[@href='#Multiple']")).click();
       driver.switchTo().frame(1);
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println(size);
        driver.switchTo().frame(0);
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("i am text");

    }

    @Test
    public void nextedFrames()
    {
        driver.get("https://demoqa.com/nestedframes"); //url

        driver.switchTo().frame("frame1"); //ilk frame (gorunen birinci frame)
        driver.switchTo().frame(0); // ilk framein icindeki frame
        System.out.println(driver.findElement(By.xpath("//body/p")).getText());  //icdeki framein textni yazdirmaq

    }
}
