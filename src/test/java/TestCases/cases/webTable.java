/*
package TestCases.cases;

import Config.Base;
import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class webTable extends Base {

    @Test
    public void test()
    {
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

       String lop = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[3]")).getText();
       System.out.println(lop);
    }

    @Test
    public void tableSetrSayi()
    {
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");

        //setr sayi
      // int olcu =  driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();

        //bir setrdeki sutun sayi
      // int olcu =  driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[2]/td")).size();
      // System.out.println(olcu);


    }





    @Test
    public void getValueFromSpecialColumn() {
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
      //  System.out.println(driver.findElement(By.xpath("//table/tbody/tr[2]/td[3]")).getText());

         //int umumiSetrSayi = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]")).size();

        ArrayList<WebElement> olkelerim = new ArrayList<>();

        olkelerim.addAll(driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]")));

       int dataSayi= olkelerim.size(); //30 //40



        //hemin deyerleri cap edek
        for(int i=0; i<dataSayi;i++)
        {
            System.out.println(olkelerim.get(i).getText());
        }


                //driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]")));




       */
/* System.out.println(driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]")).get(0).getText());
        System.out.println(driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]")).get(1).getText());
        System.out.println(driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]")).get(2).getText());
        System.out.println(driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]")).get(3).getText());
        System.out.println(driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]")).get(4).getText());
        System.out.println(driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]")).get(5).getText());
*//*




         //String  sutunDeyeri = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[3]")).get(0).getText();
        // System.out.println(sutunDeyeri);

    }
    @Test
    public void getAllRowSize() {
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        // 1-ci yol
        List<WebElement> webElements = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td[1]"));
        System.out.println(webElements.size());

        // 2-ci yol
        // System.out.println(driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size());
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
    @Test
    public void ss()
    {
        // List<WebElement> webElements = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
        //  System.out.println(webElements.get(1).findElement(By.xpath("./td")).getText());
    }

}
*/
