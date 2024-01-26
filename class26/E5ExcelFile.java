package class26;

import utils.Constants;
import utils.ExcelReader;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class E5ExcelFile
{
    public static void main(String[] args) throws IOException {
       List<Map<String,String>> data= ExcelReader.read(Constants.EXCEL_FILE_PATH,"Sheet1");
        System.out.println(data.get(1));
        System.out.println(data.get(3).get("First Name"));
        System.out.println("***************************************");

        data.forEach(x-> System.out.println(x));


    }
}
