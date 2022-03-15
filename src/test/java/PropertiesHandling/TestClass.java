package PropertiesHandling;

import Config.DriverContext;
import freemarker.cache.WebappTemplateLoader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class TestClass {
    String website;
    @BeforeTest
    public void test1() throws IOException {
        ReadProperty property = new ReadProperty();
        property.readConfigFile();
        website = property.readConfigWithKey("URL"); //https://www.google.com/
        System.setProperty(property.readConfigWithKey("chromeProperty"),property.readConfigWithKey("chromeDriverPath"));

    }

    @Test
    public void openUrl()
    {
        WebDriver driver = new ChromeDriver();
        driver.get(website);
    }
}
