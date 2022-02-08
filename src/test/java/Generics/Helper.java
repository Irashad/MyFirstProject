package Generics;

import org.openqa.selenium.WebDriver;

public class Helper  {

    WebDriver driver;
    public Helper(WebDriver driver)
    {
        this.driver = driver;
    }
    public void getUrl(String a)
    {
        driver.get(a);
    }
}
