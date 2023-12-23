package replit;

import java.util.Scanner;

public class E32 {
    public static void main(String[] args) {
            Scanner abc=new Scanner(System.in);
            System.out.println("Please enter your gender:");
            char gender=abc.next().charAt(0);
            System.out.println("Please enter your age");
            int age=abc.nextInt();
            if (age>25&&gender==('F')){
                System.out.println("Women");
            }else{System.out.println("Man");}
            if (age<25&&gender==('F')) {System.out.println("Girl");
            }else if (age<25&&gender==('M')){ System.out.println("Boy");
            }


        }
}
