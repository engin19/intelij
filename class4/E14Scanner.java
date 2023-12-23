package class4;

import java.util.Scanner;

public class E14Scanner {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        System.out.println("Please enter years of service");
        int service=abc.nextInt();
        if (service>5){
            System.out.println("You are eligible for bonus");
            System.out.println("Please enter salary amount");
        }else {
            System.out.println("Sorry! You are not eligible for bonus.");
        }
        int salary=abc.nextInt();
        if (salary>=50000){
            System.out.println(" You bonus amount is $5000");
        }else {
            System.out.println("Your bonus amount is $3000");}
            abc.close();









    }
}
