/*
package TestCases.cases;

import Config.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

public class HttPResponse extends Base {

    @Test
    public void sendRequest() {

        String url = "https://www.techlistic.com/p/demo-selenium-practice.html";
        //String url = "https://demoqa.com/";
        HttpURLConnection huc;

        //we think response code will be 200
        int expectedResponse = 200;

            try {
                //verilen url
                huc = (HttpURLConnection) (new URL(url).openConnection());
                //documentin ancaq headini goturekki status code ordadir.
                huc.setRequestMethod("HEAD");
                //connect ederek baglantini temin etmek
                huc.connect();
                expectedResponse = huc.getResponseCode();
                if (expectedResponse >= 400) {
                    System.out.println("not working: " + url+ "Response Code is "+ expectedResponse);
                } else {
                    System.out.println("Working: " + url +"Response Code is "+ expectedResponse);
                }

            }

            catch (MalformedURLException e) {
                System.out.println("Exception atdi " + url);
            }
            catch (IOException e) {
                System.out.println("IO exception atdi" + url);
            }
            catch (ClassCastException classCastExceptions) {
                System.out.println("Class cast Exception atdi " + url);
            }



    }





















































































    @Test
    public void detectBrokenLinks() {
        String homePage = "https://demoqa.com/";
        String url = "";
        HttpURLConnection huc;

        //we think response code will be 200
        int expectedResponse = 200;

        //Expand window size
        driver.manage().window().maximize();

        //Go to URL
        driver.get(homePage);

        //handle all web elements that tagname ise equals to a
        List<WebElement> links = driver.findElements(By.tagName("a"));

        Iterator<WebElement> it = links.iterator();
        while (it.hasNext()) {
            url = it.next().getAttribute("href");
            if (url == null || url.isEmpty()) {
                System.out.println("URL is not defined in a Tag");
                continue;
            }
            if (!url.startsWith(homePage)) {
                System.out.println("URL is not start with the same domain name");
            }
            try {
                //try to connect given url
                huc = (HttpURLConnection) (new URL(url).openConnection());
                //try not to get documents body since we don't need body we only need head (because heads includes response codes
                huc.setRequestMethod("HEAD");
                //establish connectinh by calling connect()
                huc.connect();
                expectedResponse = huc.getResponseCode();
                if (expectedResponse >= 400) {
                    System.out.println("not working: " + url);
                } else {
                    System.out.println("Working: " + url);
                }

            }
            catch (MalformedURLException e) {
                System.out.println("Exception atdi " + url);
            }
            catch (IOException e) {
                System.out.println("IO exception atdi" + url);
            }
            catch (ClassCastException classCastExceptions) {
                System.out.println("Class cast Exception atdi " + url);
            }
        }


    }
}
*/
