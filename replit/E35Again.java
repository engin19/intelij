package replit;

import java.util.Scanner;

public class E35Again {
    public static void main(String[] args) {
        Scanner abc = new Scanner(System.in);
        System.out.println("Do you need a loan?");
        boolean loan = abc.nextBoolean();
        if (loan == true) {
            System.out.println("what is your credit score");
            int score = abc.nextInt();
            if (score < 600) {
                System.out.println("Not eligible");
            } else if (score >= 601 && score <= 700) {

             System.out.println("Maybe eligible");}
            else if (score >= 701 && score < 800) {
                System.out.println("Eligible");
            } else if (score >= 800) {
                System.out.println("Definitely eligible ");
            }} else {
                System.out.println("Unkown");
            }
        abc.close();
    }
    }