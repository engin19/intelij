package replit;

import java.util.Scanner;

public class E33 {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        System.out.println("Please enter a number");
        int num= abc.nextInt();

        if (num%2==0){
            System.out.println("Value is even");
                        if (num>1000){
                            System.out.println("Even value is large");
                        }else if (num<=1000){
                            System.out.println("Even value is just right");
                        }

            }else if (num%2==1){
            System.out.println("Value is odd");
            if (num>1000);
                System.out.println("Odd value is large");
            }else {
                System.out.println("Odd value is just right");
            }
        }
        }


