package replit;

import java.util.Scanner;

public class E29 {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);

        System.out.println("Please enter first number");
        int f=abc.nextInt();
        System.out.println("Please enter second number");
        int s=abc.nextInt();
        if(f*s>0){System.out.println("true");
        }else if(f*s<0){System.out.println("false");}

    }
}
