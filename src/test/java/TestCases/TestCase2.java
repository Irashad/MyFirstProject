package TestCases;

import Config.Base;
import Generics.Helper;
import org.testng.annotations.Test;

public class TestCase2 extends Base {

    String url="http://demo.automationtesting.in/Alerts.html";
    @Test
    public void s1()
    {
        Helper helper = new Helper(driver);
        helper.getUrl(url);
    }



}
