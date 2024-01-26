package class27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E3FileReader {


        void readFile(){
            try {
                FileInputStream fileInputStream=new FileInputStream("C:\\Users\\engin\\IdeaProjects\\NewSDETBatch18\\Files\\Batcha18.xlsx");
            } catch (FileNotFoundException e) {
                System.out.println("Please check the file is present");
            }
        }
    }



