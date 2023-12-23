package Practice;

import java.util.Scanner;

public class Demo1 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String sc=scanner.nextLine();

        if(sc.equals("Chrome")||sc.equals("CHROME")||sc.equals("ChRoMe")){
            System.out.println("Proceed with Chrome browser");
        }if(sc.equals("FIREFOX")||sc.equals(" FireFOX")){
            System.out.println("Proceed with Firefox browser");
        }if(sc.equals("IE")||sc.equals("ie")){
            System.out.println("Proceed with IE browser");
        }else{
            System.out.println("Invalid browser");
        }


    }
        }

