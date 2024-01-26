package class26;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import utils.Constants;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class E3ExcelFile {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream(Constants.EXCEL_FILE_PATH);
        XSSFWorkbook xssfWorkbook=new XSSFWorkbook(fis);
        Sheet sheet=xssfWorkbook.getSheet("Sheet1");
        int noOfactualRowsWithData= sheet.getPhysicalNumberOfRows();
        List <Map<String,String>>excelData=new ArrayList<>();
        Row headerRow=sheet.getRow(0);
        for (int i = 1; i <noOfactualRowsWithData ; i++) {
            Row currentrow=sheet.getRow(i);
            Map<String,String> rowMap=new LinkedHashMap<>();
            int noOfActualCellsWithData=currentrow.getPhysicalNumberOfCells();
            for (int j = 0; j <noOfActualCellsWithData ; j++) {
                String key=headerRow.getCell(j).toString();
                String value=currentrow.getCell(j).toString();
                rowMap.put(key,value);

            }


        }
    }
}

