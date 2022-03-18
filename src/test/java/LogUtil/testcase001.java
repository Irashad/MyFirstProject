package LogUtil;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.io.IOException;

public class testcase001 {

    @Test
    public void ss() throws IOException {

        /**writing file*/
        mockLogger log = new mockLogger();
        log.createLogFile();
        log.write("birinci logum");
        ///he hansi test stepler burada
        log.write("Ikinci logum");



    }


    @Test
    public void readLog() throws IOException {
        /**Reading file */
        mockLogger logreader = new mockLogger();
        logreader.reader();
    }
}
