package reviewWeek3;

import java.util.Scanner;

public class E3SwitchScanner {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        System.out.println("What country are you from ?");
        String country=abc.nextLine();
        switch (country){
            case "India":
                System.out.println("You love biriyani");
            case "Turkey":
                System.out.println("You love Iskender");
            case "italy":
                System.out.println("You love pizza");


                        }


    }
}
