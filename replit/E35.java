package replit;

import java.util.Scanner;

public class E35 {
    public static void main(String[] args) {
        Scanner abc=new Scanner(System.in);

        System.out.println("Do you need a loan?");
        boolean loan=abc.nextBoolean();
        System.out.println("what is your credit score");
        int score=abc.nextInt();
            if (loan==true){
                if (score<=600)
            {
                System.out.println("Not eligible");
            }else if (score>=601&&score<=700){
                System.out.println("Maybe eligible");
            }else if (score>=701 && score<=800){
                System.out.println("Eligible");
            }else if (score>801){
                System.out.println("Definitely eligible");
            } else{System.out.println("Unknown");}
abc.close();

    }
}
}
