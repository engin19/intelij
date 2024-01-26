package class27;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E4Exception {
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
            fis = new FileInputStream("C:\\Users\\engin\\IdeaProjects\\NewSDETBatch18\\Files\\Batcha18.xlsx");
        } catch (FileNotFoundException e) {
            System.out.println("Please check the path");
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                System.out.println("Something went wrong");
            }

        }
    }
}
