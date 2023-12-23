package class5;

import java.util.Scanner;

public class E16Homework {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        System.out.println("Please enter your grade");
        String grade=abc.next();
        switch (grade){
            case"A":
                System.out.println("A-Excellent");
                break;
            case"B":
                System.out.println("B-Good");
                break;
            case"C":
                System.out.println("C-Average");
                break;
            case"D":
                System.out.println("D-Bad");
                break;
            default:
                System.out.println("Not Acceptable");
        }



    }
}
