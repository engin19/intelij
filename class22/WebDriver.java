package class22;

public interface WebDriver {
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();

}
class ChromeDriver implements WebDriver {

    @Override
    public void openBrowser() {
        System.out.println("Opening Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Browser...");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maxing Window");

    }

    @Override
    public void findElement() {
        System.out.println("Finding the element");

    }
}
class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("Opening Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("Closing Browser...");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("Maxing Window");

    }

    @Override
    public void findElement() {
        System.out.println("Finding the element");
    }
}
