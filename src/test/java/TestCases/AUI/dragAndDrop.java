package TestCases.AUI;


import Config.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class dragAndDrop extends Base {

    @Test
    public void rightClick() throws InterruptedException {
        driver.manage().window().maximize();
        String url = "http://demo.guru99.com/test/drag_drop.html";
        driver.get(url);
        //Element which needs to drag.
        WebElement From=driver.findElement(By.xpath("//*[@id='credit2']/a"));

        //Element on which need to drop.
        WebElement To=driver.findElement(By.xpath("//*[@id='bank']/li"));

        //Using Action class for drag and drop.
        Actions builder=new Actions(driver);

        //Dragged and dropped.
        Action dragAndDrop = builder.dragAndDrop(From,To).build();
        dragAndDrop.perform();
     }
    @AfterTest
    public void afterTest(){System.out.println("Test Finished Successfully");}
}
