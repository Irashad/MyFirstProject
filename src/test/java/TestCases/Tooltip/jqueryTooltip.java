package TestCases.Tooltip;

import Config.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class jqueryTooltip extends Base {

    @Test
    public void jqueryTooltipThatWorks()
    {
        driver.get("http://demo.guru99.com/test/tooltip.html");
       WebElement btn_downloadNow = wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a#download_now")));
       Actions builder = new Actions(driver);
       Action moveTo = builder.moveToElement(btn_downloadNow).build();
       moveTo.perform();
       out(wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href='/release-notes']"))).getText());

    }


    @Test
    public void WrongWayjqueryTooltip()
    {
        driver.get("http://demo.guru99.com/test/tooltip.html");
        out(wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("a[href='/release-notes']"))).getText());
    }

    public void out(String a)
    {
        System.out.println(a);
    }
}
