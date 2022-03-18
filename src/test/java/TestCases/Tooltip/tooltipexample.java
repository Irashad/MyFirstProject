package TestCases.Tooltip;

import Config.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class tooltipexample extends Base {

    @Test
    public void wrongWayOfGettingToolTipValue()
    {
        driver.get("https://www.w3schools.com/css/css_tooltip.asp");
        out(wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.tooltip>span"))).getText());


    }

    @Test
    public void rightWayOfGettingToolTipValue()
    {

        driver.get("https://www.w3schools.com/css/css_tooltip.asp");
        Actions builder = new Actions(driver);
        Action act = builder.moveToElement(
                wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.tooltip")))).build();
        act.perform();
        out(wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.tooltip>span"))).getText());
    }




    public void out(String a)
    {
        System.out.println(a);
    }
}
