package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.ConfigReader;
import utils.ExcelReader;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class HWSelenium {
    public static void main(String[] args) throws IOException {
        WebDriver driver=new ChromeDriver();
        String path="C:\\Users\\engin\\IdeaProjects\\NewSDETBatch18\\Files\\HRMSTestData.xlsx";
        String sheetName="Sheet1";
        List<Map<String, String>> testData = ExcelReader.read(path, sheetName);
        System.out.println(testData);
        String url = ConfigReader.read("url");
        String userName = ConfigReader.read("userName");
        String password = ConfigReader.read("password");
        WebDriver webDriver = new ChromeDriver();
        webDriver.manage().window().maximize();
        webDriver.get(url);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        WebElement userNameWE = webDriver.findElement(By.xpath("//input[@id='txtUsername']"));
        WebElement passwordWE = webDriver.findElement(By.xpath("//input[@id='txtPassword']"));
        WebElement enterBtn = webDriver.findElement(By.xpath("//input[@id='btnLogin']"));
        userNameWE.sendKeys(userName);
        passwordWE.sendKeys(password);
        enterBtn.click();
        testData.forEach(x->{
            webDriver.findElement(By.xpath("//*[@id=\"menu_pim_viewPimModule\"]/b")).click();
            webDriver.findElement(By.xpath("//*[@id=\"menu_pim_addEmployee\"]")).click();
            webDriver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Engin");
            webDriver.findElement(By.xpath("//*[@id=\"middleName\"]")).sendKeys("FB");
            webDriver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Ozdemir");
            webDriver.findElement(By.xpath("//*[@id=\"chkLogin\"]")).click();
            webDriver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
            webDriver.findElement(By.xpath("//*[@id=\"user_name\"]")).sendKeys("engin77tr");
            webDriver.findElement(By.xpath("//*[@id=\"user_password\"]")).sendKeys("!2#4Aileen%6");
            webDriver.findElement(By.xpath("//*[@id=\"re_password\"]")).sendKeys("!2#4Aileen%6");
            webDriver.findElement(By.xpath("//*[@id=\"btnSave\"]")).click();
            webDriver.close();
        });

    }

}
