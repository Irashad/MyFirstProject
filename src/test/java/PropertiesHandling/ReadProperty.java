package PropertiesHandling;

import java.io.IOException;
import java.util.Properties;

public class ReadProperty {
  //  private static String filePath ="C:\\Users\\resha\\IdeaProjects\\MyFirstProject\\src\\test\\java\\PropertiesHandling\\myconfig.properties";
    public static Properties myProperty;
    public void readConfigFile() throws IOException {
         myProperty = new Properties();
         myProperty.load(getClass().getResourceAsStream("/myconfig.properties"));
    //    myProperty.load(getClass().getResourceAsStream("myconfig.properties"));

   /*     FileInputStream read = new FileInputStream(filePath);
        myProperty = new Properties();
        myProperty.load(read);*/
    }


    public String  readConfigWithKey(String key)
    {
        return myProperty.getProperty(key); // https://www.google.com/
    }
}
