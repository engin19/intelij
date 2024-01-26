package reviewWeek11;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class E5Files {
    public static void main(String[] args) throws IOException {

// Location
        String path = "C:\\Users\\engin\\IdeaProjects\\NewSDETBatch18\\Files\\Config.properties";
        FileInputStream fis=new FileInputStream(path);
        Properties properties=new Properties();
        properties.load(fis);
        System.out.println(properties.getProperty("url"));
    }
}