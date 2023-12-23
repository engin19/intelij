package replit;

import java.util.Scanner;

public class E31 {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);

        System.out.println("Is it sunny outside?");
        boolean isSunny=abc.nextBoolean();
        if(isSunny==true){
            System.out.println("It is a sunny day, I should go somewhere!");
            System.out.println("What is the temperature outside?");
        }else{ System.out.println( "I stay home and practice Java");}
        int temp=abc.nextInt();
        if(temp>85){System.out.println("I am going to the beach");
        }else{System.out.println( "I am going to the park");}
abc.close();
    }
}
