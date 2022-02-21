package TestCases;

import Config.Base;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Excel extends Base {

    @Test
    public void ss() throws IOException {
        File filePath = new File("C:\\Users\\resha\\IdeaProjects\\web\\src\\test\\java\\testdata.xlsx");
        FileInputStream readFile = new FileInputStream(filePath);
        XSSFWorkbook xssfWorkbook = new XSSFWorkbook(readFile);
        XSSFSheet excelSheet = xssfWorkbook.getSheetAt(0);

    }



}
