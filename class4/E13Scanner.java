package class4;

import java.util.Scanner;

public class E13Scanner {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        System.out.println("Please enter years of service");
        int service= abc.nextInt();
        System.out.println("Please enter your Salary");
        int salary=abc.nextInt();

        if (service>=5){
            System.out.println("You are eligible for bonus");
            if (salary>=50000){
                System.out.println("you get $5000");
            }else {
                System.out.println("you get $3000");
            }
        }else {
            System.out.println("you are not eligible for bonus");
        }
    }
}
