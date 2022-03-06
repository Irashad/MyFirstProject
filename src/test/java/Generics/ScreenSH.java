package Generics;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;

public class ScreenSH {



        public String getScreenShot(WebDriver driver,String imageName) throws IOException
        {
                TakesScreenshot ts = (TakesScreenshot) driver;
                File src = ts.getScreenshotAs(OutputType.FILE);
                // String path = System.getProperty("user.dir")+"/Screenshot"+System.currentTimeMillis();
                //String path ="C:\\Users\\resha\\IdeaProjects\\MyFirstProject\\"+imageName+".png";
                String path ="C:\\Users\\resha\\IdeaProjects\\MyFirstProject\\target\\Spark\\"+imageName+".png";
                File destination = new File(path);
                FileUtils.copyFile(src,destination);
                System.out.println("vallah destionation budu " +destination.getAbsolutePath());
                System.out.println("vallah qaytardigim budu " +path);
                return destination.getAbsolutePath();
        }




}
