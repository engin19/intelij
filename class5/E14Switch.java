package class5;

import java.util.Scanner;

public class E14Switch {
    public static void main(String[] args) {
        //Allow user to enter grade (A, B, or C etc...) and then
        // provide explanation: A-Excellent, B-Good, C-Average, D-Bad,
        // any other grade --> Not Acceptable. At the end your program
        // should print which grade was entered by a user with
        // explanation.
        Scanner abc=new Scanner(System.in);
        System.out.println("please enter your grade");
        String grade=abc.next();
        if (grade.equals("A")){
            System.out.println("A-Excellent");
        } else if (grade.equals("B")) {
            System.out.println("B-Good");

        }else if (grade.equals("C")){
            System.out.println("C-Average");
        }else if (grade.equals("D")){
            System.out.println("D-Bad");
        }else {
            System.out.println("Not Acceptable");
        }

    }
}
