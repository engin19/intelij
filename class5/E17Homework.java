package class5;

import java.util.Scanner;

public class E17Homework {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        System.out.println("Please enter num1");
        int num1=abc.nextInt();
        System.out.println("Please enter num2");
        int num2= abc.nextInt();
        System.out.println("Please choose your operation");

        String operation= abc.next();

        switch (operation){
            case("Multiplication"):
                System.out.println(num1*num2);
                break;
            case("Division"):
                System.out.println(num1/num2);
                break;
            case("Addition"):
                System.out.println(num1+num2);
                break;
            case("Subtraction"):
                System.out.println(num1-num2);
                break;
            default:
                System.out.println("it is not an operation");

        }

    }
}
