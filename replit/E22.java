package replit;

import java.util.Scanner;

public class E22 {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        System.out.println("Enter your name");
        String name= abc.nextLine();
        System.out.println("Enter your mobile number");
        String phone=abc.nextLine();
        System.out.println("Enter your age");
        int age= abc.nextInt();
        System.out.println("Your name is "+ name+" ,your age is "+age+" ,your mobile number is "+phone);

    }
}
