package replit;

import java.util.Scanner;

public class E28 {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);
        System.out.println("Please enter the length");
        int length=abc.nextInt();
        System.out.println("Please enter the width");
        int width= abc.nextInt();
        if(length==width){System.out.println("The shape of your object is square");
        }else{System.out.println("The shape of your object is rectangle");
        }
    }
}