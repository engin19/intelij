package class5;

import java.util.Scanner;

public class E13Switch {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);

        System.out.println("Please enter your country");
        String country=abc.next();
        switch(country){
            case "Turkey":
                System.out.println("Turkish");
                break;
            case "usa":
                System.out.println("English");
                break;
            case "Spain":
                System.out.println("spanish");
                break;
            case "Brazil":
                System.out.println("Portguese ");
                break;
            case "China":
                System.out.println("Chinese");
                break;
            default:
                System.out.println("different language");
        }


    }

}
