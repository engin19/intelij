package replit;

import java.util.Scanner;

public class E27 {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        System.out.println("Please enter your age");
        int age= abc.nextInt();
        if (age>18){
            System.out.println("You are eligible to vote");
        }else{
            System.out.println("You are not eligible to vote");
        }
    }
}
