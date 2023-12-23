package class5;

import java.util.Scanner;

public class E15Homework {
    public static void main(String[] args) {
        /*Using scanner class create calculator.
         Allow user to enter 2 numbers and operator(+,-,*,/).
         Based on operator provide the result to user.
Please complete this assignment in 2 ways:
using if statement and switch case.
  */
        Scanner abc=new Scanner(System.in);
        System.out.println("Please enter num1");
        double num1=abc.nextDouble();

        System.out.println("Please enter num2");
        double num2= abc.nextDouble();
        System.out.println("Please choose your operation");
        String operation= abc.next();
        if (operation.equals("Multiplication")){
            System.out.println(num1*num2);
        }else if (operation.equals("Division")){
            System.out.println(num1/num2);
        }else if (operation.equals("Addition")) {
            System.out.println(num1+num2);
        }else if ((operation.equals("Subtraction"))){
            System.out.println(num1-num2);
        }






    }
}

