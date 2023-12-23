package class4;

import java.util.Scanner;

public class E8Scanner {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        System.out.println("Please enter your gender M/F");
        char gender=abc.next().charAt(0);
        System.out.println("Your gender is "+gender);
    }
}
