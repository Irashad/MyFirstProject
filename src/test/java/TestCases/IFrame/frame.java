package TestCases.IFrame;

import Config.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class frame extends Base {


    @Test
    public void s2() throws InterruptedException {
        driver.get("http://demo.automationtesting.in/Frames.html");
        Thread.sleep(2000);
        driver.switchTo().frame("singleframe");
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("i am text");
        driver.switchTo().defaultContent();
        driver.findElement(By.linkText("Practice Site")).click();
    }
}
