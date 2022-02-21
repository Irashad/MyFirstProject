package TestCases;

import Config.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class webTable extends Base {

    /**
     * Table-da her hansi setrin sutunundan deyeri elde etmek*/
    @Test
    public void getValueFromSpecificColumn() {
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        String sutunDeyeri =  driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]")).getText();
        System.out.println(sutunDeyeri);
    }

    /**
     * Tabledaki setrlerin sayinin elde edilmesi*/
    @Test
    public void getRowSizeOfTable() {
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        //  System.out.println(driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]")).getText());
        System.out.println(driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]")).size());
    }
    /**
     * Butun setrlerdeki 2ci sutunlardan deyerlerin elde edilmesi*/
    @Test
    public void getAllValuesFromSecondColumn() {
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        List<WebElement> elementler = new ArrayList<>();

        // driver.findelements vasitesile elde olunan elementlerin hamisinin birden elementler listine elave edilmesi
        elementler.addAll(driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[2]")));

        //hemin listedeki elementlerin textlerinin elde edilmesi
        for(int i=0; i <elementler.size();i++)
        {
            System.out.println(elementler.get(i).getText());
        }

    }

}
