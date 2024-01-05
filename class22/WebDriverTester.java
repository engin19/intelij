package class22;

public class WebDriverTester {
    public static void main(String[] args) {

        WebDriver cd=new ChromeDriver();
        WebDriver fd=new FirefoxDriver();
         cd.closeBrowser();
        cd.openBrowser();
        cd.findElement();
        cd.maximizeWindow();
        System.out.println("--------------------------------------------");
        fd.closeBrowser();
        fd.openBrowser();
        fd.findElement();
        fd.maximizeWindow();
    }
}
