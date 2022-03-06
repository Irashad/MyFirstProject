package Generics;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelUtility {


    public String  readData(int row, int column) throws IOException, FileNotFoundException {

        File excelPath = new File("C:\\Users\\resha\\IdeaProjects\\MyFirstProject\\excel\\data.xlsx");

        FileInputStream readFile = new FileInputStream(excelPath);

        XSSFWorkbook workbook = new XSSFWorkbook(readFile);
        XSSFSheet excelSheet = workbook.getSheetAt(0);

          return  excelSheet.getRow(row).getCell(column).toString();






    }
}
