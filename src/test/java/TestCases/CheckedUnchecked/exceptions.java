package TestCases.CheckedUnchecked;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class exceptions {
    WebDriver driver;
    @Test
    public void test1() {
        clasim cl = new clasim();
        driver = cl.giveMeDriver();
        driver.get("https://www.google.com");
    }
}
