package class19;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class Browser{
        void get(String url){
            System.out.println("Loading... "+url+" in Browser");
        }
        void performTest(){
            System.out.println("Checking if website is working properly Browser");
        }
        void closBrowser(){
            System.out.println("Closing the  Browser");
        }
    }
    class Chrome  extends Browser{

        void get(String url){
            System.out.println("Loading... "+url+" in Chrome");
        }
        void performTest(){
            System.out.println("Checking if website is working properly in chrome");
        }
        void closBrowser(){
            System.out.println("Closing the Google Chrome Browser");
        }

        public static void main(String[] args) {
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com/");
        }

    }





