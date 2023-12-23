package replit;

import java.util.Scanner;

public class E23 {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);

        System.out.println("Input the boolean value");
        String bo=abc.nextLine();
        switch(bo){
            case "false":
        System.out.println("The value is false");
        break;
            case "true":
        System.out.println("The value is true");
        break;
        }
    }
}
