package TestCases;

import Config.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class webTable extends Base {
    @Test
    public void mueyyensutundakideyer() {
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
      //  System.out.println(driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]")).getText());

        System.out.println(driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]")).get(0).getText());
    }

    @Test
    public void ucuncustundakideyerlerinsayi() {
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        //  System.out.println(driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]")).getText());

        System.out.println(driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]")).size());
    }
    @Test
    public void ikincisutundakideyerlerineldeedilmesi() {
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

        List<String> a = new ArrayList<>();


        for(int i=0; i <driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]")).size();i++)
        {
            a.add(driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]")).get(i).getText());

        }

        for (String s:a
             ) {
            System.out.println(s);
        }
    }

}
