package class25;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class E4ExcelFile {
    public static void main(String[] args) throws IOException {
        String path="C:\\Users\\engin\\IdeaProjects\\NewSDETBatch18\\Files\\Batcha18.xlsx";
        //Navigate to the file.
        FileInputStream fis=new FileInputStream(path);
        // this is a special class that we need to handle Excel files
        XSSFWorkbook excel=new XSSFWorkbook(fis);
        // to access the sheet from that file
        Sheet sheet=excel.getSheet("Sheet1");
        //Accessing the rows from the above sheet
        Row row1= sheet.getRow(1);
        //Accessing the column from above rows
        Cell cell1=row1.getCell(1);
        System.out.println(cell1);


    }
}
