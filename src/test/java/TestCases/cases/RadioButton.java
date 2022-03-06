package TestCases.cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RadioButton {
    WebDriver driver;
    @BeforeTest
    public void BeforeTest(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\resha\\IdeaProjects\\MyFirstProject\\src\\test\\java\\chromedriver97469271.exe");
        driver = new ChromeDriver();
    }
    /**
     * 1. clickle
     * 2. yoxlaki qus qoyulubmu*/
    @Test
    public void radioButton() throws InterruptedException {

        driver.get("https://demo.guru99.com/test/radio.html");
        Thread.sleep(2000);
        driver.findElement(By.id("vfb-7-2")).click();
        Assert.assertEquals(driver.findElement(By.id("vfb-7-2")).isSelected(),true);  // a vs b
       /* if(driver.findElement(By.id("vfb-7-2")).isSelected())
        {
            //todo
            checked=true;
            System.out.println("Clicklenib "+checked);
        }else {

            System.out.println("Element Clicklenmeyib "+checked);
            //todo
        }*/

    }
    //Checking if element have  "disabled" attribute
    @Test
    public void isRadioButtonEnable() throws InterruptedException {
        driver.get("https://demoqa.com/radio-button");
        Thread.sleep(2000);
        //this 2 lines not working because these onlyworkswhen enabled atribute have. not disabled.
        //  System.out.println(driver.findElement(By.xpath("//label[@for='noRadio']")).isDisplayed());
        // System.out.println(driver.findElement(By.xpath("//label[@for='yesRadio']")).isDisplayed());
        //when we have disabled attribute , we should use this.this works
        // WebElement element = driver.findElement(By.xpath("//label[@for='noRadio']"));
        //Boolean disabled = (Boolean) ((JavascriptExecutor) driver).executeScript("return arguments[0].hasAttribute(\"disabled\");", element);
        //System.out.println(disabled);
    }

}
