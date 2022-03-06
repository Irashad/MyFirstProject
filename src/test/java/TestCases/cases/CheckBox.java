/*
package TestCases.cases;
import Config.Base;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
public class CheckBox extends Base {

    @Test
    public void test() throws InterruptedException {
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Cars");
        Thread.sleep(3000);
        driver.findElement(By.name("btnK")).click();
        Thread.sleep(5000);
        String s = driver.findElement(By.name("q")).getAttribute("value");
        System.out.println("your string is" +s);
    }



    */
/**
     * 1 check elesin elementi click()
     * 2. hemin elementin check olundugunu*//*

    @Test
    public void CheckBox() throws InterruptedException {
        driver.get("https://demo.guru99.com/test/radio.html");
        Thread.sleep(2000);
        String id="vfb-6-0";

        driver.findElement(By.id(id)).click();

        Assert.assertEquals(driver.findElement(By.id(id)).isSelected(),true);


        //this 2 lines not working because these onlyworkswhen enabled atribute have. not disabled.
        //  System.out.println(driver.findElement(By.xpath("//label[@for='noRadio']")).isDisplayed());
        // System.out.println(driver.findElement(By.xpath("//label[@for='yesRadio']")).isDisplayed());
        //when we have disabled attribute , we should use this.this works
        // WebElement element = driver.findElement(By.xpath("//label[@for='noRadio']"));
        //Boolean disabled = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].hasAttribute(\"disabled\");", element);
        //System.out.println(disabled);
    }
    @Test
    public void linkText() {
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        //driver.findElement(By.linkText("CONTACT")).click();
        driver.findElement(By.partialLinkText("ONT")).click();
    }
}
*/
